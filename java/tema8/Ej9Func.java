package VisualStudio.java.tema8;

import VisualStudio.java.tema8.misFunciones.Varias;
import java.util.Scanner;

public class Ej9Func {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Vamos a comparar 3 números para saber cuál es el mayor valor introducido.");
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        num3 = sc.nextInt();

        //Comparamos los números introducidos

        int mayor;
        mayor = Varias.comparaMayor(num1, num2);

        mayor = Varias.comparaMayor(mayor, num3);

        System.out.println("El mayor número introducido es " + mayor + ".");

        sc.close();
        
    }
}
