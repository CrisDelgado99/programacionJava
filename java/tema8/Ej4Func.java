package VisualStudio.java.tema8;

import java.util.Scanner;
import VisualStudio.java.tema8.misFunciones.Varias;

public class Ej4Func {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a decir cuál es el signo de un número introducido.");
        System.out.print("Introduce el número: ");
        int num;
        num = sc.nextInt();

        int signo;
        signo = Varias.dimeSigno(num);

        switch(signo){
            case -1:
                System.out.println("Tu número es negativo");
                break;
            case 0 :
                System.out.println("Tu número es un 0");
                break;
            default:
                System.out.println("Tu número es positivo");
        }

        sc.close();
    }    
}
