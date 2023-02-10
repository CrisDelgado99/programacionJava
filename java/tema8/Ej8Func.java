package VisualStudio.java.tema8;

import VisualStudio.java.tema8.misFunciones.Varias;
import java.util.Scanner;

public class Ej8Func {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        int sumaTodos;
        sumaTodos = Varias.suma1aN(num);

        System.out.println("La suma de todos los números de 1 a " + num + " es: " + sumaTodos);

        int multTodos;
        multTodos = Varias.producto1aN(num);

        System.out.println("El producto de todos los números de 1 a " + num + " es: " + multTodos);

        double interm;
        interm = Varias.intermedio1aN(num);

        System.out.println("El el número intermedio entre 1 y " + num + " es: " + interm);

        sc.close();
    }
}
