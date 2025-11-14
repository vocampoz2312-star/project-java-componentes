public class Transmision {
    public String tipo;
    public int numeroVelocidades;
    public String traccion;
    public boolean estado;

    // Constructor
    public Transmision(String tipo, int numeroVelocidades, String traccion, boolean estado) {
        this.tipo = tipo;
        this.numeroVelocidades = numeroVelocidades;
        this.traccion = traccion;
    }

    // Metodo

    public void mostrarTransmision() {
        System.out.println("==Informacion de la Transmision== ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de Velocidades: " + numeroVelocidades);
        System.out.println("Traccion: " + traccion);
    }
}