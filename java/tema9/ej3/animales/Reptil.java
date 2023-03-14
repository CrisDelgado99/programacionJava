package tema9.ej3.animales;

public class Reptil {

    private String clasificacion;
    private String tipo;
    private String raza;
    private String imagen;

    private int patas;
    private int ojos;
    
    private boolean cola;
    private boolean vuela;

    public Reptil(){
        clasificacion = "Reptil";
    }

    public String getClasificacion(){
        return this.clasificacion;
    }
}

