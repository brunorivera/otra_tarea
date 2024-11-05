// Archivo: MainPlanetas.java
public class MainPlanetas {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 150, Planeta.TipoPlaneta.TERRESTRE, true, 1, 0.997);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139820, 778, Planeta.TipoPlaneta.GASEOSO, true, 11.86, 0.413);

        // Imprimir los datos de la Tierra
        tierra.imprimir();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad() + " kg/km^3");
        System.out.println("¿Es exterior?: " + tierra.esExterior());

        // Imprimir los datos de Júpiter
        jupiter.imprimir();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad() + " kg/km^3");
        System.out.println("¿Es exterior?: " + jupiter.esExterior());
    }
}
