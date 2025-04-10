package pablo;

/**
 * Clase Persona con nombre y edad.
 */
public class Persona {
    private String nombre; /** Valor del nombre de la persona. */
    private int edad; /** Valor de la edad de la persona. */

    /**
     * Constructor de la clase Persona.
     * @param nombre Valor del nombre de la persona.
     * @param edad Valor de la edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Devuelve el valor del nombre de la persona.
     * @return Valor del nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor del nombre de la persona.
     * @param nombre Valor del nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor de la edad de la persona.
     * @return Valor de la edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece el valor de la edad de la persona.
     * @param edad Valor de la edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que imprime el nombre y la edad de la persona.
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

