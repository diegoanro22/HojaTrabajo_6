import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Expression<Integer> validate = new Expression<>();
        int exp = 0;


        System.out.println("Seleccione una opción:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        exp = scanner.nextInt();
 
        switch (exp) {
            case 1:
                validate.checkExpression(exp);
                break;

            case 2: 
                validate.checkExpression(exp);
                break;

            case 3:
                validate.checkExpression(exp);
                break;
        
            default:
                System.out.println("Opcion no valida");
                break;
        }


    }
}


