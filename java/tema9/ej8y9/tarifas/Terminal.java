package tema9.ej8y9.tarifas;

public class Terminal {
    private int segundos;

    private String telefono;

    public Terminal(String telefono){
        this.telefono = telefono;
        segundos = 0;
    }

    //tostring
    public String toString(){
        return "Nº " + this.telefono + " - " + this.segundos + "s de conversación";
    }

    //otros métodos
    public void llama(Terminal otroTerminal, int segundos){
        this.segundos += segundos;
        otroTerminal.segundos += segundos;
    }


}
