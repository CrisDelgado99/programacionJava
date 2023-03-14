package tema9.ej3.animales;

public class Canario extends Ave{
    private String clasificacion;
    private String tipo;
    private String raza;
    private String imagen;
    private String nombre;

    private int patas;
    private int ojos;
    
    private boolean cola;
    private boolean vuela;
    
    //constructor///////////////////////////////////////////
    public Canario(String r, String n){
        clasificacion = super.getClasificacion();
        tipo = "Canario";

        patas = 2;
        ojos = 2;
        cola = false;
        vuela = true;

        raza = r;
        nombre = n;

        imagen = "  ___\n ('v')\n((   ))\n--m-m--";
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

    public boolean getVuela(){
        return this.vuela;
    }

    //Otros métodos

    public void imprimirCanario(){
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

        if(vuela){
            System.out.printf("%-15s%s\n","Vuela:", "Sí");
        } else {
            System.out.printf("%-15s%s\n","Vuela:", "No");
        }
    }

    public void piar(){
        System.out.println("Pío, pío");
    }

    public void cantar(){
        System.out.println(" pío         pío");
        System.out.println("       pío       pío");
        System.out.println("            pío");
        System.out.println("   pío");
    }
}
