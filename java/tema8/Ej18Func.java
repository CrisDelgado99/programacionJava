package VisualStudio.java.tema8;

import java.util.Scanner;
import VisualStudio.java.tema8.misFunciones.Varias;

public class Ej18Func {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int dni;

        System.out.println("Vamos a comprobar cuál es el NIF de tu DNI \n-El NIF es la letra.");
        System.out.print("Introduzca el número de su DNI (Sin letra): ");
        
        dni = sc.nextInt();

        String letra;
        letra = Varias.nifDni(dni);

        System.out.println("El NIF de tu DNI es: " + letra);

        sc.close();
    }
}
