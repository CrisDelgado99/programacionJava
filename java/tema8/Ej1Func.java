package VisualStudio.java.tema8;

import java.util.Scanner;
import VisualStudio.java.tema8.misFunciones.Varias;

public class Ej1Func {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a multiplicar dos números.");
        System.out.print("Introduce el primer número: ");
        double num1;
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        double num2;
        num2 = sc.nextInt();

        double mult;
        mult = Varias.multiplica(num1, num2);

        System.out.println(num1 + " x " + num2 + " = " + mult);

        sc.close();
    }

}
