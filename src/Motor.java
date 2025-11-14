public class Motor {
    public double cilindraje;
    public int pontenciaHP;
    public String tipoCombustible;
    public int numCilindros;

    // Constructor
    public Motor(double cilindraje, int pontenciaHP, String tipoCombustible, int numCilindros) {
        this.cilindraje = cilindraje;
        this.pontenciaHP = pontenciaHP;
        this.tipoCombustible = tipoCombustible;
    }

    // Metodo
    public void mostrarMotor() {
        System.out.println("==Informacion del Motor== ");
        System.out.println("Cilindraje: " + cilindraje + " L");
        System.out.println("Potencia: " + pontenciaHP + " HP");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }
}