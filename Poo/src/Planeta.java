// Archivo: Planeta.java
public class Planeta {
    // Enumeración para los tipos de planeta
    enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO }

    String nombre;
    int cantidadSatelites;
    double masa;
    double volumen;
    int diametro;
    int distanciaMediaSol; // en millones de kilómetros
    TipoPlaneta tipo;
    boolean observableSimpleVista;
    double periodoOrbital; // en años
    double periodoRotacion; // en días

    // Constructor que inicializa todos los atributos
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipo, boolean observableSimpleVista, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipo = tipo;
        this.observableSimpleVista = observableSimpleVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // Método para imprimir los atributos del planeta
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km^3): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia media al Sol (millones km): " + distanciaMediaSol);
        System.out.println("Tipo de Planeta: " + tipo);
        System.out.println("Observable a simple vista: " + observableSimpleVista);
        System.out.println("Periodo Orbital (años): " + periodoOrbital);
        System.out.println("Periodo de Rotación (días): " + periodoRotacion);
        System.out.println();
    }

    // Método para calcular la densidad del planeta
    public double calcularDensidad() {
        return masa / volumen;
    }

    // Método para determinar si el planeta es exterior (más allá del cinturón de asteroides)
    public boolean esExterior() {
        int distanciaEnKm = distanciaMediaSol * 149597870; // Convertir a kilómetros
        return distanciaEnKm > (3.4 * 149597870); // Más allá de 3.4 UA
    }
}
