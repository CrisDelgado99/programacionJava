package VisualStudio.java.tema8.misFunciones;

import java.util.Scanner;

public class Varias {

    // Función 6, voltea
    public static int voltea(int num) {
        /*
         * @info Esta función voltea un número entero
         * 
         * @param num número entero
         * 
         * @return numVolt número entero volteado
         */
        int numVolt;
        numVolt = 0;
        int resto;
        resto = 1;

        while (num > 0) {
            resto = num % 10;
            numVolt = numVolt * 10 + resto;
            num /= 10;
        }
        return numVolt;
    }

    // Función 1, esCapicua
    public static boolean esCapicua(int num) {
        /*
         * @info Esta función dice si un número es capicúo
         * 
         * @param num número entero
         * 
         * @return boolean según si es capicúo o no
         */
        int numVolt;
        numVolt = voltea(num);

        if (num == numVolt) {
            return true;
        }
        return false;
    }

    // Función 2, esPrimo
    public static boolean esPrimo(int num) {
        /*
         * @info Esta función dice si un número es primo o no
         * 
         * @param num número entero
         * 
         * @return boolean según si es primo o no
         */
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void esPrimoVoid(int num){
        boolean esPrimo;
        esPrimo = esPrimo(num);

        if(esPrimo){
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }
    }

    // Función 3, sigPrimo
    public static int sigPrimo(int num) {
        /*
         * @info Esta función dice el siguiente número primo a un número dado
         * 
         * @param num número entero
         * 
         * @return número entero
         */
        boolean primo;
        primo = false;

        while (primo == false) {
            num++;
            primo = esPrimo(num);
        }

        return num;
    }

    // Función 4, potencia
    public static int potencia(int b, int e) {
        /*
         * @info Esta función realiza una potencia de base b y exponente e
         * 
         * @param b base, número entero
         * 
         * @param e exponente, número entero
         * 
         * @return acum, resultado de la potencia
         */
        int acum;
        acum = 1;

        for (int i = 1; i <= e; i++) {
            acum *= b;
        }
        return acum;
    }

    // Función 5, digitos
    public static int digitos(int num) {
        /*
         * @info Esta función dice la cantidad de dígitos de un número dado
         * 
         * @param num número entero
         * 
         * @return cantNum, número entero, cantidad de digitos del número
         */
        int cantNum;
        cantNum = 0;

        while (num > 0) {
            cantNum++;
            num /= 10;
        }
        return cantNum;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static boolean esMayorEdad(int edad) {
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    public static int minimo(int a, int b) {
        if (a <= b) {
            return a;
        }
        return b;
    }

    public static int dimeSigno(int a) {
        int signo;
        signo = 0;
        if (a == 0) {
            signo = 0;
        } else if (a > 0) {
            signo = 1;
        } else {
            signo = -1;
        }

        return signo;
    }

    public static int suma1aN(int num){
        int suma;
        suma = 0;

        for(int i = 1; i <= num; i++){
            suma += i;
        }

        return suma;
    }

    public static int producto1aN(int num){
        int mult;
        mult = 1;

        for(int i = 1; i <= num; i++){
            mult *= i;
        }

        return mult;
    }

    public static double intermedio1aN(int num){
        double intermedio;
        intermedio = suma1aN(num)/num;
        
        return intermedio;
    }

    public static void tablaMultiplicar(int num){
        int mult;
        for(int i = 0; i <= 10; i++){
            mult = num * i;
            System.out.printf("%-1d * %-2d = %-3d\n",num , i , mult);
        }
    }

    public static int comparaMayor(int x, int y){
        if(x >= y){
            return x;
        } 

        return y;
    }

    public static void piramide(String a, int l){
        int cantEsp;
        int cantA;
        cantEsp = l - 1;
        for(int i = 1; i <= l; i++){
            for(int i2 = 1; i2 <= cantEsp; i2++){
                System.out.print(" ");
            }
            cantEsp--;
            cantA = i * 2 - 1;
            for(int i2 = 1; i2 <= cantA; i2++){
                System.out.print(a);
            }
            System.out.println("");
        }
    }

    public static String nifDni(int num){
        
        String letra;

        int numLetra;
        numLetra = num%23;

        switch (numLetra){
            case 0:
            letra = "T";
            break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            default:
                letra = "E";
        }
        return letra;
    }

    public static int menu(String op1, String op2){
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Escoja una opción:");
        System.out.println(op1);
        System.out.println(op2);
        opcion = sc.nextInt();

        while(opcion < 1 || opcion > 2){
            System.out.print("El número introducido no es una opción. Introduce 1 o 2: ");
            opcion = sc.nextInt();
        }

        return opcion;
    }

}
