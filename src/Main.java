
public class Main {
    public static void main(String[] args) {
        // Creacion de objeto Vehiculo
        Vehiculo miVehiculo = new Vehiculo(1, "Toyota", "Corolla", "Rojo", 2020);
        miVehiculo.mostrarVehiculo();

         Motor motor1 = new Motor(4.0, 300, "Diesel", 4);
        motor1.mostrarMotor();

        Transmision transmision1 = new Transmision("Automatica", 5, "Trasera", true);
        transmision1.mostrarTransmision();

        Chasis chasis1 = new Chasis("Monocasco", "Acero reforzado", 350.2, 5.20, 1.78, 1.45);
        chasis1.mostrarChasis();

        Neumatico neumatico1 = new Neumatico("Michelin", "All-Terrain", "225/65 R17", 102, 72 );
        neumatico1.mostrarNeumatico();

        SistemaElectrico sistemaElectrico1 = new SistemaElectrico(12, 120, "AGM", 70, true, 25);
        sistemaElectrico1.mostrarSistemaElectrico();

       SistemaFrenos frenos = new SistemaFrenos("Disco ABS", "Tambor", true, 280, 85, 90);
        frenos.mostrarSistemaFrenos();

        RegistroVehicular registro = new RegistroVehicular("OJG-123", "Vanessa Ocampo", "2023-03-05");
        registro.mostrarRegistro();

        Mantenimiento manteniento1 = new Mantenimiento("2025-02-10", "Cambio de aceite y revisión general", "2025-02-10", "Cambio de filtros y alineación", 95.000, 50.000);
        manteniento1.mostrarMantenimiento();

        Sensor sensor1 = new Sensor("Temperatura del Motor", "°C", 87, true, "SENS-TEMP-01");
        sensor1.mostrarSensor();

    
    }
    
}
