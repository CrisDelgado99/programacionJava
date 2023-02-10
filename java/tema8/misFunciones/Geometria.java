package VisualStudio.java.tema8.misFunciones;

import java.util.Scanner;

public class Geometria {

    public static double perimetroRectangulo(double ancho, double alto){
        return (2*(ancho + alto));
    }

    public static double areaRectangulo(double ancho, double alto){
        return (ancho * alto);
    }

    public static double pideRadio(String linea){
        Scanner sc = new Scanner(System.in);

        double radio;

        System.out.print(linea);
        radio = sc.nextDouble();

        return radio;
    }
    
}
