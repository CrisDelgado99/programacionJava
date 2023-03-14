package tema9.ej3.animales;

public class Ave extends Animal{
    private String clasificacion;
    private String tipo;
    private String raza;
    private String imagen;

    private int patas;
    private int ojos;
    
    private boolean cola;
    private boolean vuela;

    public Ave(){
        clasificacion = "Ave";
    }

    public String getClasificacion(){
        return this.clasificacion;
    }
}
