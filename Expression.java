public class Expression<T> {

    Factory<T> Factory = new Factory<>();

    public InterfaceInstruction<T> checkExpression(int exp) {
        int[] reserved = {1, 2, 3};
        for (int digit : reserved) {
            if (exp == digit) {
                InterfaceInstruction<T> interfaceInstruction = Factory.classDirection(exp);
                return interfaceInstruction;
            }
        }
        return null;
    }

    
}
