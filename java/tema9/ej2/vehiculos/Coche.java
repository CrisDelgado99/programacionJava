package tema9.ej2.vehiculos;

public class Coche extends Vehiculo {
    //Strings necesarias
    private String tipoVehiculo = "Coche";
    private String nombreVehiculo;

    //Variables numerales necesarias
    private static int vehiculosCreados = 0;
    private double kilometrosRecorridos = 0;
    private static double kilometrosTotales = 0;


    public Coche(String nombre){
        this.nombreVehiculo = nombre;
    }

    
}
