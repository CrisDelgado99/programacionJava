package VisualStudio.java.tema8.misFunciones;

public class FunciArrays {

    //Funcion 20, generaArrayInt
    public static int[] generaArrayInt(int t, int min, int max) {
        int mult;
        mult = (max - min) + 1;

        int[] num = new int[t];

        for (int fila = 0; fila < t; fila++) {
            num[fila] = (int) (Math.random() * mult + min);
        }
        return num;
    }

    //Funcion 21, minimoArrayInt
    public static int minimoArrayInt(int[] num) {
        int min;
        min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        return min;
    }
    //Funcion 22, maximoArrayInt
    public static int maximoArrayInt(int[] num) {
        int max;
        max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    //Funcion ej 15 relación, suma Array
    public static int sumaArrayInt(int[] num){
        int suma;
        suma = 0;

        for(int i = 0; i < num.length; i++){
            suma += num[i]; 
        }

        return suma;
    }

    //Funcion 23, mediaArrayInt
    public static int mediaArrayInt(int[] num) {
        int media;

        int t;
        t = num.length;

        int suma;
        suma = sumaArrayInt(num);

        media = suma / t;

        return media;
    }

    //Funcion 24, estaEnArrayInt
    public static boolean estaEnArrayInt(int[] num, int numComp) {
        boolean esta;
        esta = false;

        for (int i = 0; i < num.length; i++) {
            if (numComp == num[i]) {
                esta = true;
            }
        }

        return esta;
    }

    //Funcion 25, posicionEnArray
    public static int posicionEnArray(int[] num, int numComp) {
        int posicion;
        posicion = 0;

        for (int i = 0; i < num.length; i++) {
            if (numComp == num[i]) {
                posicion = i;
            }
        }

        return posicion;
    }

    //Funcion 26, volteaArrayInt
    public static int[] volteaArrayInt(int[] num) {
        int t;
        t = num.length;

        int iVolt;
        iVolt = t - 1;

        int[] volt = new int[t];

        for (int i = 0; i < t; i++) {
            volt[iVolt] = num[i];
            iVolt--;
        }

        return volt;
    }

        //Funcion 27, rotaDerechaArrayInt
    public static int[] rotaDerechaArrayInt(int[] num, int n) {
        int[] rDer = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            rDer[(i + n) % num.length] = num[i];
        }
        return rDer;
    }

    //Funcion 28, rotaIzquierdaArrayInt
    public static int[] rotaIzquierdaArrayInt(int[] num, int n) {
        n = n % num.length;
        int[] rIzq = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            rIzq[i] = num[(i + n) % num.length];
        }
        return rIzq;
    }

    public static int[] arrayNumNaturales(int t){
        int[] numNat = new int[t];

        for(int i = 0; i < t; i++){
            numNat[i] = i + 1;
        }

        return numNat; 
    }
}
