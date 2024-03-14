import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Expression<Integer> checkfactory = new Expression<>();
        int exp = 0;
        InterfaceInstruction mapImplement = null;
        Archivo archivotxt = new Archivo("cards_desc.txt");


        System.out.println("Seleccione una opción:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        exp = Integer.parseInt(input.nextLine());

        switch (exp) {
            case 1:
                mapImplement = checkfactory.checkExpression(exp);
                break;

            case 2:
                mapImplement= checkfactory.checkExpression(exp);
                break;

            case 3:
                mapImplement = checkfactory.checkExpression(exp);
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
        
        int opcionMenu = menu();



    }

    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Agregar una carta a la colección");
        System.out.println("2. Mostrar el tipo de una carta específica.");
        System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta en la colección");
        System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta de la colección ordenadas por tipo");
        System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes");
        System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes ordenadas por tipo");
        int opcion = Integer.parseInt(input.nextLine());
        input.close();
        return opcion;

    }
}
