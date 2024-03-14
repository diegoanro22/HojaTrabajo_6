import java.util.Map;
import java.util.HashMap;

public class HashMapClass<T> implements InterfaceInstruction<T>{
    private Map<String, String> map = new HashMap<>();

    @Override
    public void agregarCarta(String nombre, String detalle) {
        map.put(nombre, detalle);
    }

    @Override
    public void mostrarTipo(String nombre) {
        String tipo = map.get(nombre);
        if (tipo != null) {
            System.out.println("El tipo de " + nombre + " es " + tipo);
        } else {
            System.out.println("La carta no existe.");
        }
    }

    @Override
    public void mostrarNombreTipoCant() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue());
        }
    }

    @Override
    public void mostrarNombreTipoCantSorted() {
        map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue()));
    }

    @Override
    public void mostrarNombreTipoAll() {
        mostrarNombreTipoCant();
    }

    @Override
    public void mostrarNombreTipoAllSorted() {
        mostrarNombreTipoCantSorted();
    }


}