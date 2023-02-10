package VisualStudio.java.tema8;

import VisualStudio.java.tema8.misFunciones.FunciArrays;

public class Ej15Func {
    public static void main(String[]args){
        System.out.println("Vamos a crear un array con los primeros 100 números naturales:");

        int t;
        t = 100;

        int suma;
        int media;
    
        int[] numNat = FunciArrays.arrayNumNaturales(t);
        for(int i = 0; i < t; i++){
            System.out.printf("%-4d", numNat[i]);
        }

        System.out.println("");

        suma = FunciArrays.sumaArrayInt(numNat);

        media = FunciArrays.mediaArrayInt(numNat);

        System.out.println("La suma de los 100 primeros números naturales es: " + suma);
        System.out.println("La media de los 100 primeros números naturales es: " + media);
        
    }

}
