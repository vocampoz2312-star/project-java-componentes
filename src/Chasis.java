public class Chasis {
    public String tipo;
    public String material;
    public double peso;
    public double longitud;
    public double ancho;
    public double altura;

    // Constructor
    public Chasis(String tipo, String material, double peso, double longitud, double ancho, double altura) {
        this.tipo = tipo;
        this.material = material;
        this.peso = peso;
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    // Metodo
    public void mostrarChasis() {
        System.out.println("==Informacion del Chasis== ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Material: " + material);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Longitud: " + longitud + " m");
        System.out.println("Ancho: " + ancho + " m");
        System.out.println("Altura: " + altura + " m");
    }
}