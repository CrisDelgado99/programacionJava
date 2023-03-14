package tema9.ej7;

import java.util.Scanner;

import tema9.ej7.zonas.Zona;

public class ZonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        int opcion1;
        int opcion2;
        int numEntradas;

        do {
            System.out.println("Seleccione una de estas opciones: (1-3)");
            System.out.println("1. Mostrar número de entradas disponible");
            System.out.println("2. Comprar entradas");
            System.out.println("3. Salir");

            opcion1 = sc.nextInt();
            while (opcion1 < 1 || opcion1 > 3) {
                System.out.println("Lo siento, esa no es una opción válida.");
                System.out.print("Introduzca un número del 1 al 3: ");
                opcion1 = sc.nextInt();
            }

            switch (opcion1) {
                case 1:
                    System.out.println("Este es el número de entradas que quedan:");
                    System.out.println("Zona principal: " + principal.getEntradasPorVender());
                    System.out.println("Zona compra-venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Zona VIP: " + vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.println("¿Para qué zona desea comprar la entrada? (1-3)");
                    System.out.println("1. Zona principal");
                    System.out.println("2. Zona compra-venta");
                    System.out.println("3. Zona VIP");
                    opcion2 = sc.nextInt();
                    while (opcion2 < 1 || opcion2 > 3) {
                        System.out.println("Lo siento, esa no es una opción válida.");
                        System.out.print("Introduzca un número del 1 al 3: ");
                        opcion2 = sc.nextInt();
                    }
                    System.out.print("¿Cuántas entradas desea comprar?: ");
                    numEntradas = sc.nextInt();

                    switch (opcion2) {
                        case 1:
                            principal.vender(numEntradas);
                            break;
                        case 2:
                            compraVenta.vender(numEntradas);
                            break;
                        default:
                            vip.vender(numEntradas);
                    }
                    break;
                default:
                    System.out.println("Saliendo. Gracias por usar nuestro programa.");
            }
            System.out.println("");
        } while (opcion1 != 3);

        sc.close();
    }

}
