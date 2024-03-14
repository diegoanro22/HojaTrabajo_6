import java.util.Stack;

public class Expression<T> {

    Stack<String> stack = new Stack<>();
    Factory<T> stackFactory = new Factory<>();

    public void checkExpression(int exp) {
        int[] reserved = {1, 2, 3};
        for (int digit : reserved) {
            if (exp == digit) {
                InterfaceFactory<T> stackInterface = stackFactory.classDirection(exp);
                stackInterface.execute(exp);
                return;
            }
        }
    }
}
