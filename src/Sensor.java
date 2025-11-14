public class Sensor {
    public String tipo;
    public String unidadMedida;
    public double valorActual;
    public boolean estado; 
    public String idSensor;

    // Constructor
    public Sensor(String tipo, String unidadMedida, double valorActual, boolean estado, String idSensor) {
        this.tipo = tipo;
        this.unidadMedida = unidadMedida;
        this.valorActual = valorActual;
        this.estado = estado;
        this.idSensor = idSensor;
    }

    // Método
    public void mostrarSensor() {
        System.out.println("== Información del Sensor ==");
        System.out.println("ID: " + idSensor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Unidad de Medida: " + unidadMedida);
        System.out.println("Valor Actual: " + valorActual + " " + unidadMedida);
        System.out.println("Estado: " + (estado ? "Funcional" : "Falla Detectada"));
    }
}