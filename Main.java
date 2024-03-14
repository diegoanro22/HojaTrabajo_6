import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        @SuppressWarnings("rawtypes")
        Expression checkfactory = new Expression<>();
        int exp = 0;
        @SuppressWarnings("rawtypes")
        InterfaceInstruction mapImplement;
        Archivo archivotxt = new Archivo("cards_desc.txt");
        ArrayList<String> archivo = null;

        try{
            archivo = archivotxt.leerArchivo();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        System.out.println("Seleccione una opción:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        exp = Integer.parseInt(input.nextLine());

        mapImplement = checkfactory.checkExpression(exp);
        for (String linea : archivo) {
            String [] parts = linea.split("\\|",2);
            mapImplement.agregarCarta(parts[0],parts[1]);
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
