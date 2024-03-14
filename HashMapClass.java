import java.util.Map;
import java.util.HashMap;

public class HashMapClass<T> implements InterfaceInstruction<T>{
    private Map<String, String> map = new HashMap<>();

    @Override
    public void agregarCarta(String nombre, String detalle) {
        map.put(nombre, detalle);
    }

    @Override
    public void mostrarTipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarTipo'");
    }

    @Override
    public void mostrarNombreTipoCant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarNombreTipoCant'");
    }

    @Override
    public void mostrarNombreTipoCantSorted() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarNombreTipoCantSorted'");
    }

    @Override
    public void mostrarNombreTipoAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarNombreTipoAll'");
    }

    @Override
    public void mostrarNombreTipoAllSorted() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarNombreTipoAllSorted'");
    }


}