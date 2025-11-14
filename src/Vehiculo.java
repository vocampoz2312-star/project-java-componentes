public class Vehiculo {
    public int id;
    public String marca;
    public String modelo;
    public String color;
    public int anio;

    // Constructor
    public Vehiculo(int id, String marca, String modelo, String color, int anio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }

    // metodo
    public void mostrarVehiculo() {
        System.out.println("==Informacion del Vehicuilo== ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
    }
}