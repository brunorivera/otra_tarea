// Archivo: MainPersona.java
// Archivo: MainPersonas.java
public class Mainpersonas {
    public static void main(String[] args) {
        persona p1 = new persona("Pedro", "Pérez", "1053121010", 1998, "Colombia", 'H');
        persona p2 = new persona("Luis", "León", "1053223344", 2001, "Perú", 'M');

        p1.imprimir();
        p2.imprimir();
    }
}
