package tema9ArrayObj.ej1y2;

import tema9ArrayObj.ej1y2.animales.Gato;

public class GatoMainEj2 {
    public static void main(String[]args){
        Gato[] gato = new Gato[5];

        String[][] datos = {
            {"Siamés", "Garfield"},
            {"Pardo","Enrico"},
            {"Manchado", "Manchitas"},
            {"Siamés","Manolo"},
            {"British shorthair","Luna"}
        };

        for(int i = 0; i < 5; i++){
            gato[i] = new Gato(datos[i][0], datos[i][1]);
        }

        for(int i = 0; i < 5; i++){
            gato[i].imprimirGato();
            System.out.println();
        }
    }
}
