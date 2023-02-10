package VisualStudio.java.tema8;

import VisualStudio.java.tema8.misFunciones.Geometria;
import VisualStudio.java.tema8.misFunciones.Varias;

import java.util.Scanner;

public class Ej21Func {
    public static void main(String[]args){
        String op1;
        op1 = "1. Circunferencia";
        String op2;
        op2 = "2. Área";

        int opcion;
        opcion = Varias.menu(op1, op2);

        String pideR;
        pideR = "Introduce el radio: ";

        double radio;
        radio = Geometria.pideRadio(pideR);

        System.out.println(radio);
        
    }
}
