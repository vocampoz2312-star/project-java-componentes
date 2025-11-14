public class RegistroVehicular {
    public String matricula;
    public String propietario;
    public String fechaRegistro;

    // Constructor
    public RegistroVehicular(String matricula, String propietario, String fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    // Metodo
    public void mostrarRegistro() {
        System.out.println("==Informacion del Registro Vehicular== ");
        System.out.println("Matricula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha de Registro: " + fechaRegistro);
    }
}