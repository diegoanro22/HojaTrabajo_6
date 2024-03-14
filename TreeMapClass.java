import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass<T> implements InterfaceInstruction<T> {
    private Map<String, String> mapTotal = new TreeMap<>();
    private Map<String, String> mapUsuario = new TreeMap<>();

    @Override
    public void agregarCarta(String nombre, String detalle) {
        mapTotal.put(nombre, detalle);
    }

    @Override
    public void agregarCartaUsuario(String nombre, String detalle) {
        mapUsuario.put(nombre, detalle);
    }

    @Override
    public void mostrarTipo(String nombre) {
        String tipo = mapTotal.get(nombre);
        if (tipo != null) {
            System.out.println("El tipo de " + nombre + " es " + tipo);
        } else {
            System.out.println("La carta no existe.");
        }
    }

    @Override
    public void mostrarNombreTipoCant() {
        for (Map.Entry<String, String> entry : mapUsuario.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue());
        }
    }

    @Override
    public void mostrarNombreTipoCantSorted() {
        mapUsuario.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue()));
    }

    @Override
    public void mostrarNombreTipoAll() {
        for (Map.Entry<String, String> entry : mapTotal.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue());
        }
    }

    @Override
    public void mostrarNombreTipoAllSorted() {
        mapTotal.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue()));
    }
}
