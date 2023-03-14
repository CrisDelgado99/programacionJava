package tema9.ej2.vehiculos;

public class Bicicleta extends Vehiculo {
    //Strings necesarias
    private String tipoVehiculo = "Bicicleta";
    private String nombreVehiculo;

    //Variables numerales necesarias
    private static int vehiculosCreados = 0;
    private double kilometrosRecorridos = 0;
    private static double kilometrosTotales = 0;

    public Bicicleta(String nombre){
        this.nombreVehiculo = nombre;
    }

    

    
}
