package tema9.ej2;

import java.util.Scanner;

import tema9.ej2.vehiculos.Bicicleta;
import tema9.ej2.vehiculos.Coche;

public class VehiculosMain {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Coche coche = new Coche("Seat 1");

        Bicicleta bici = new Bicicleta("Rayo");


        //MENÚ
        System.out.println("VEHÍCULOS");
        System.out.println("==========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.print("Elige una opción (1-8): ");

        int opcion;
        opcion = sc.nextInt();

        while(opcion < 0 || opcion > 8){
            System.out.println("Esa no es una opción válida.");
            System.out.print("Elige una opción (1-8): ");
            opcion = sc.nextInt();
        }

        int kmAndados;

        switch(opcion){
            case 1:
                System.out.print("¿Cuántos kilómetros quieres que ande tu bicicleta?: ");
                kmAndados = sc.nextInt();
                bici.anda(kmAndados);
                break;
            case 2:
                
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
        }
    }
}
