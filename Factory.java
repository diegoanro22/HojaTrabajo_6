public class Factory<T>{

    public InterfaceInstruction<T> classDirection(int reserved){
        
        switch (reserved){
            case (1):
                return new HashMapClass<>();
            case(2):
                return new TreeMapClass<>();

            case(3): 
                return new LinkedHashMapClass<>();

            default:
                throw new IllegalArgumentException("Opcion no valida" + reserved);
        }
    }
}