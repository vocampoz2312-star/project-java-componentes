public class SistemaFrenos {
    public String tipoFrenoDelantero;
    public String tipoFrenoTrasero;
    public boolean tieneABS;
    public double diametroDisco;
    public int estadoPastillas;     
    public int nivelLiquidoFrenos;

    // Constructor
    public SistemaFrenos(String tipoFrenoDelantero, String tipoFrenoTrasero, boolean tieneABS, double diametroDisco, int estadoPastillas, int nivelLiquidoFrenos) {
        this.tipoFrenoDelantero = tipoFrenoDelantero;
        this.tipoFrenoTrasero = tipoFrenoTrasero;
        this.tieneABS = tieneABS;
        this.diametroDisco = diametroDisco;
        this.estadoPastillas = estadoPastillas;
        this.nivelLiquidoFrenos = nivelLiquidoFrenos;
    }

    // Metodo
    public void mostrarSistemaFrenos() {        
        System.out.println("==Informacion del Sistema de Frenos== ");
        System.out.println("Tipo de Freno Delantero: " + tipoFrenoDelantero);
        System.out.println("Tipo de Freno Trasero: " + tipoFrenoTrasero);
        System.out.println("Tiene ABS: " + (tieneABS ? "Si" : "No"));
        System.out.println("Diametro del Disco: " + diametroDisco + " cm");
        System.out.println("Estado de las Pastillas: " + estadoPastillas + " %");
        System.out.println("Nivel de Liquido de Frenos: " + nivelLiquidoFrenos + " %");
    }
}