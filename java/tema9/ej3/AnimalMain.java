package tema9.ej3;

import tema9.ej3.animales.Canario;
import tema9.ej3.animales.Gato;
import tema9.ej3.animales.Lagarto;
import tema9.ej3.animales.Perro;
import tema9.ej3.animales.Pinguino;

public class AnimalMain {
    
    public static void main(String[] args){

        System.out.println("¡Bienvenido! Te quiero presentar a mis animales:");

        Perro dogui = new Perro("Spitz Alemán", "Dogui");

        dogui.imprimirPerro();

        System.out.println("\n" + dogui.getNombre() + ", ¡Ladra!");
        dogui.ladrar();

        System.out.println("\n" + dogui.getNombre() + ", ¡La patita!");
        dogui.laPatita();

        System.out.println("\n------------------------------------------------");

        Gato whiskers = new Gato("Siamés", "Whiskers");

        whiskers.imprimirGato();

        System.out.println("\n" + whiskers.getNombre() + ", ¡Maulla!");
        whiskers.maullar();

        System.out.println("\n" + whiskers.getNombre() + ", ¡Trepa!");
        whiskers.trepar();

        System.out.println("\n------------------------------------------------");

        Canario piolin = new Canario("Timbrado español", "Piolín");

        piolin.imprimirCanario();

        System.out.println("\n" + piolin.getNombre() + ", ¡Pía!");
        piolin.piar();

        System.out.println("\n" + piolin.getNombre() + ", ¡Canta una canción!");
        piolin.cantar();

        System.out.println("\n------------------------------------------------");

        Pinguino pingu = new Pinguino("Emperador", "Pingu");

        pingu.imprimirPinguino();

        System.out.println("\n" + pingu.getNombre() + ", ¡Grazna!");
        pingu.graznar();

        System.out.println("\n------------------------------------------------");

        Lagarto lizy = new Lagarto("Azul de Gorgona", "Lizy");

        lizy.imprimirLagarto();

        System.out.println("\n" + lizy.getNombre() + ", ¡Sisea!");
        lizy.sisear();
    }

}
