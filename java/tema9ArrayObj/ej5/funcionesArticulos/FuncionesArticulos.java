package tema9ArrayObj.ej5.funcionesArticulos;

import tema9ArrayObj.ej5.articulos.Articulo;

public class FuncionesArticulos {
    
    public static int conseguirSiguienteVacio(Articulo[] array){
        int posicion = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                return i;
            }
        }
        return posicion;
        
    }

    public static void imprimirArticulos(Articulo[] array){
        int contador;
        contador = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                System.out.println(array[i].toString());
                contador++;
            }
        }

        if (contador == 0){
            System.out.println("No existen artículos en este momento.");
        }
    }
}
