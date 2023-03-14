package tema9.ej2.vehiculos;

public class Vehiculo{
    //Strings necesarias
    private String tipoVehiculo;
    private String nombreVehiculo;

    //Variables numerales necesarias
    private static int vehiculosCreados = 0;
    private double kilometrosRecorridos = 0;
    private static double kilometrosTotales = 0;

    public static int getVehiculosCreados(){
        return Vehiculo.vehiculosCreados;
    }

    public static double getKilometrosTotales(){
        return Vehiculo.vehiculosCreados;
    }

    public double getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }

    public void anda(double km){
        this.kilometrosRecorridos += km;
        Vehiculo.kilometrosTotales += km;
    }
}