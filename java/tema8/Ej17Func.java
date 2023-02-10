package VisualStudio.java.tema8;

import java.util.Scanner;
import VisualStudio.java.tema8.misFunciones.Varias;

public class Ej17Func {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Vamos a comprobar si los números introducidos son primos o no.");
        System.out.println("Para salir del programa, excriba 0.");

        do{
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();

            while(num < 0){
                System.out.print("Lo siento, los números negativos no pueden ser primos. Introduzca un número positivo: ");
                num = sc.nextInt();
            }

            if(num == 1){
                System.out.println("El número 1 es primo por definición.");
            } else if(num == 0){
                System.out.println("Gracias por usar este programa.");
            } else {
                Varias.esPrimoVoid(num);
            }

        } while(num != 0);

        sc.close();
    }
}
