package tema9ArrayObj.ej1y2.animales;

public class Mamifero extends Animal{
    private String clasificacion;
    private String tipo;
    private String raza;
    private String imagen;

    private int patas;
    private int ojos;
    
    private boolean cola;

    public Mamifero(){
        clasificacion = "Mamífero";
    }

    public String getClasificacion(){
        return this.clasificacion;
    }
}
