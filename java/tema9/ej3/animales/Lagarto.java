package tema9.ej3.animales;

public class Lagarto extends Reptil{
    private String clasificacion;
    private String tipo;
    private String raza;
    private String imagen;
    private String nombre;

    private int patas;
    private int ojos;
    
    private boolean cola;
    
    //constructor///////////////////////////////////////////
    public Lagarto(String r, String n){
        clasificacion = super.getClasificacion();
        tipo = "lagarto";

        patas = 4;
        ojos = 2;
        cola = true;

        raza = r;
        nombre = n;

        imagen = "0--0^^^^^^^^\\______\n\\__/||---||-------~\n    ``   ``";
    }

    //getters//////////////////////////////////////

    public String getClasificacion(){
        return this.clasificacion;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getRaza(){
        return this.raza;
    }

    public String getImagen(){
        return this.imagen;
    }

    public int getPatas(){
        return this.patas;
    }

    public int getOjos(){
        return this.ojos;
    }

    public boolean getCola(){
        return this.cola;
    }

    //Otros métodos

    public void imprimirLagarto(){
        System.out.println(this.imagen);
        System.out.printf("%-15s%s\n", "Nombre: ", this.nombre);
        System.out.printf("%-15s%s\n","Clasificación: ", this.clasificacion);
        System.out.printf("%-15s%s\n", "Tipo: ", this.tipo);
        System.out.printf("%-15s%s\n", "Raza: ", this.raza);
        System.out.printf("%-15s%d\n", "Patas: ", this.patas);
        System.out.printf("%-15s%d\n", "Ojos: ", this.ojos);

        if(cola){
            System.out.printf("%-15s%s\n","Cola:", "Sí");
        } else {
            System.out.printf("%-15s%s\n","Cola:", "No");
        }
    }

    public void sisear(){
        System.out.println("SSSSSSS");
    }
}
