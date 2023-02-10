package VisualStudio.java.tema8;

import java.util.Scanner;
import VisualStudio.java.tema8.misFunciones.Varias;
public class Ej11Func {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para mostrarte su tabla de multiplicar: ");
        int num;
        num = sc.nextInt();

        Varias.tablaMultiplicar(num);

        sc.close();
    }


}
