package VisualStudio.java.tema8;

import VisualStudio.java.tema8.misFunciones.Geometria;
import java.util.Scanner;

public class Ej7Func {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double ancho;
        double alto;

        System.out.println("Vamos a calcular el perímetro y el área de un rectángulo");
        System.out.print("Introduzca el ancho del rectángulo: ");
        ancho = sc.nextDouble();

        System.out.print("Introduzca el alto del rectángulo: ");
        alto = sc.nextDouble();

        double area;
        area = Geometria.areaRectangulo(ancho, alto);

        System.out.print("El área de un rectángulo de " + ancho + "cm de ancho y " + alto + "cm de alto ");
        System.out.println(" es " + area + "cm2.");

        double perimetro;
        perimetro = Geometria.perimetroRectangulo(ancho, alto);

        System.out.print("El perímetro de un rectángulo de " + ancho + "cm de ancho y " + alto + "cm de alto ");
        System.out.println(" es " + perimetro + "cm.");

        sc.close();
    }
}
