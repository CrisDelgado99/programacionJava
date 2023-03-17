package tema9ArrayObj.ej1y2;

import java.util.Scanner;

import tema9ArrayObj.ej1y2.animales.Gato;

public class GatoMainEj1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = 4;

        Gato[] gato = new Gato[t];

        String raza;
        String nombre;

        System.out.println("¡Vamos a crear 4 gatos!" );

        for(int i = 0; i < t; i++){
            System.out.println("Gato " + (i+1) + ":");

            System.out.print("¿Cuál es el nombre de tu gato? ");
            nombre = sc.next();

            System.out.print("¿Cuál es la raza de tu gato? ");
            raza = sc.next();

            gato[i] = new Gato(raza, nombre);
            System.out.println();
        }

        for(int i = 0; i < t; i++){
            gato[i].imprimirGato();
            System.out.println();
        }

    }
}
