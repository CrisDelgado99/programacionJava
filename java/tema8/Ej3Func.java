package VisualStudio.java.tema8;

import java.util.Scanner;
import VisualStudio.java.tema8.misFunciones.Varias;

public class Ej3Func {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a decir cuál es el mínimo valor introducido.");
        System.out.print("Introduce el primer número: ");
        int num1;
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2;
        num2 = sc.nextInt();

        int min;
        min = Varias.minimo(num1, num2);

        System.out.println("El mínimo valor introducido es el " + min);

        sc.close();
    }    
}
