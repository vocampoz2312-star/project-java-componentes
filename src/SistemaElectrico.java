public class SistemaElectrico {
     public int voltajeSistema;
    public int capacidadAlternador;
    public String tipoBateria;
    public int capacidadBateria;
    public int numeroSensores;

    // Constructor
    public SistemaElectrico(int voltajeSistema, int capacidadAlternador, String tipoBateria, int capacidadBateria, boolean tieneECU, int numeroSensores) {
        this.voltajeSistema = voltajeSistema;
        this.capacidadAlternador = capacidadAlternador;
        this.tipoBateria = tipoBateria;
        this.capacidadBateria = capacidadBateria;
        this.numeroSensores = numeroSensores;
    }

    // Metodo
    public void mostrarSistemaElectrico() {
        System.out.println("==Informacion del Sistema Electrico== ");
        System.out.println("Voltaje del Sistema: " + voltajeSistema + " V");
        System.out.println("Capacidad del Alternador: " + capacidadAlternador + " A");
        System.out.println("Tipo de Bateria: " + tipoBateria);
        System.out.println("Capacidad de la Bateria: " + capacidadBateria + " Ah");
        System.out.println("Numero de Sensores: " + numeroSensores);
    }
}