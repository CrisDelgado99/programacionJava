package tema9.ej8y9.tarifas;

public class Movil extends Terminal{
    private int segundos = 0;
    private Tarifa tarifa;
    private double costeTarifa;
    private double costeTotal;

    private String telefono;

    public Movil(String telefono, String tarifa){
        super(telefono);
        this.tarifa = setTarifa(tarifa);
        this.costeTarifa = setCosteTarifa();
    }

    //setters

    public Tarifa setTarifa(String tarifa){
        if(tarifa.equals("rata")){
            return Tarifa.rata;
        } else if(tarifa.equals("mono")){
            return Tarifa.mono;
        } else {
            return Tarifa.bisonte;
        }
    }

    public double setCosteTarifa(){
        if(tarifa.equals(Tarifa.rata)) {
            return 0.06;
        } else if (tarifa.equals(Tarifa.mono)) {
            return 0.12;
        } else {
            return 0.30;
        }
    }

    //tostring
    public String toString(){
        return "Nº " + this.telefono + " - " + this.segundos + "s de conversación - tarificados " + this.costeTotal + " euros";        
    }

    //otros 
    public void llama(Movil otroMovil, int segundos){
        this.segundos += segundos;
        otroMovil.segundos += segundos;
        this.costeTotal += segundos/60 * this.costeTarifa;
    }


}
