package tema9.ej11.tarjetas;

public class TarjetaRegalo {
    private double saldo;
    private int codigo;

    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        this.codigo = setCodigo();
    }

    //setters
    public int setCodigo(){
        int codigo;
        codigo = (int)(Math.random()*89999+9999);
        return codigo;
    }

    //getters
    public int getCodigo(){
        return this.codigo;
    }

    //toString
    public String toString(){
        return "Tarjeta nº " + this.codigo + " - Saldo " + this.saldo + " euros";
    }

    //otros métodos
    public void gasta(double dinero){
        if(dinero > saldo){
            System.out.printf("No tiene suficiente saldo para gastar %.2f euros\n", dinero);
        } else {
            this.saldo -= dinero;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta){
        TarjetaRegalo x = new TarjetaRegalo(this.saldo+otraTarjeta.saldo);
        this.saldo = 0;
        otraTarjeta.saldo = 0;
        return x;
    }


}
