package VisualStudio.java.tema8;

import java.util.Scanner;
import VisualStudio.java.tema8.misFunciones.Varias;

public class Ej14Func {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String a;
        int numL;

        System.out.println("Vamos a dibujar una pirámide.");
        System.out.print("Introduce el caracter del que quieres que esté hecha: ");
        a = sc.next();

        System.out.print("Introduce el número de líneas: ");
        numL = sc.nextInt();

        Varias.piramide(a, numL);

        sc.close();
    }
}
