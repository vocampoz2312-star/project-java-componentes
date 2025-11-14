public class Mantenimiento {
    public String ultimoMantenimientoFecha;
    public String ultimoMantenimientoDescripcion;
    public String proximoMantenimientoFecha;
    public String proximoMantenimientoDescripcion;
    public double kilometrajeActual;
    public double kilometrajeProximoMantenimiento;

    // Constructor
    public Mantenimiento(String ultimoMantenimientoFecha, String ultimoMantenimientoDescripcion,
            String proximoMantenimientoFecha, String proximoMantenimientoDescripcion,
            double kilometrajeActual, double kilometrajeProximoMantenimiento) {

        this.ultimoMantenimientoFecha = ultimoMantenimientoFecha;
        this.ultimoMantenimientoDescripcion = ultimoMantenimientoDescripcion;
        this.proximoMantenimientoFecha = proximoMantenimientoFecha;
        this.proximoMantenimientoDescripcion = proximoMantenimientoDescripcion;
        this.kilometrajeActual = kilometrajeActual;
        this.kilometrajeProximoMantenimiento = kilometrajeProximoMantenimiento;
    }

    // Método
    public void mostrarMantenimiento() {
        System.out.println("== Información de Mantenimiento ==");
        System.out.println("Último Mantenimiento:");
        System.out.println("  Fecha: " + ultimoMantenimientoFecha);
        System.out.println("  Descripción: " + ultimoMantenimientoDescripcion);

        System.out.println("\nPróximo Mantenimiento Programado:");
        System.out.println("  Fecha: " + proximoMantenimientoFecha);
        System.out.println("  Descripción: " + proximoMantenimientoDescripcion);

        System.out.println("\nKilometraje Actual: " + kilometrajeActual + " km");
        System.out.println("Kilometraje Próximo Mantenimiento: " + kilometrajeProximoMantenimiento + " km");
    }
}