package tema9.ej5.pizzas;

public class Pizza {
    private Tamanio tamanio;
    private Tipo tipo;
    private Estado estado;

    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza(String ta, String ti){
        tamanio = setTamanio(ta);
        tipo = setTipo(ti);
        estado = Estado.pedida;
        Pizza.totalPedidas++;
    }

    //setters

    public Tamanio setTamanio(String ta){
        if(ta.equals("pequeña")){
            return Tamanio.pequeña;
        } else if(ta.equals("mediana")){
            return Tamanio.mediana;
        } else {
            return Tamanio.grande;
        }
    }

    public Tipo setTipo(String ti){
        if(ti.equals("margarita")){
            return Tipo.margarita;
        } else if(ti.equals("cuatro quesos")){
            return Tipo.cuatroquesos;
        } else {
            return Tipo.funghi;
        }
    }

    public Estado setEstado(String e){
        if(e.equals("pedida")){
            return Estado.pedida;
        } else {
            return Estado.servida;
        }
    }

    //getters

    public static int getTotalPedidas(){
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas(){
        return Pizza.totalServidas;
    }

    //otros métodos
    public static void aumentarServidas(){
        Pizza.totalServidas++;
    }
    public void sirve(){
        if(this.estado == Estado.servida){
            System.out.println("esa pizza ya se ha servido");
        } else {
            this.estado = Estado.servida;
            Pizza.aumentarServidas();
        }
    }

    //toString

    public String toString(){
        return "pizza " + this.tipo + " " + this.tamanio + ", " + this.estado;
    }
}


