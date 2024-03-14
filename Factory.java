public class Factory<T>{

    public InterfaceInstruction<T> classDirection(int reserved){
        
        switch (reserved){
            case (1):
            return new HashMap<>();

            case(2):
            return new TreeMap<>();

            case(3): 
            return new LinkedHashMap<>();

            default:
                throw new IllegalArgumentException("Opcion no valida" + reserved);
        }
    }
}