
// Archivo: Persona.java
public class persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int añoNacimiento;
    String paisNacimiento;
    char genero;

    // Constructor que inicializa todos los atributos
    public persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    // Método para imprimir los datos de la persona
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Número de Documento: " + numeroDocumentoIdentidad);
        System.out.println("Año de Nacimiento: " + añoNacimiento);
        System.out.println("País de Nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
        System.out.println();
    }
}
