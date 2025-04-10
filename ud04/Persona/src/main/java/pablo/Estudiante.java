package pablo;

/**
 * Clase Estudiante con nombre, edad y calificación.
 */
public class Estudiante {
    private static final int EDADESCOLAR = 12; /** Constante de la edad escolar. */
    private static final int EDADMAYOR = 18; /** Constante de la edad de mayor edad. */
    private static final int APROBADO = 5; /** Constante del aprobado. */
    private String nombre; /** Valor del nombre del estudiante.*/
    private int edad; /** Valor de la edad del estudiante.*/
    private double calificacion; /** Valor de la calificación del estudiante. */

    /**
     * Constructor de la clase Estudiante.
     * @param nombre Valor del nombre del estudiante.
     * @param edad Valor de la edad del estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Establece el valor de la calificación del estudiante.
     * @param calificacion Valor de la califación.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Devuelve el valor del nombre del estudiante.
     * @return Valor del nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     * @param nombre Valor del nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor de la edad del estudiante.
     * @return Valor de la edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante.
     * @param edad Valore de la edad del estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve el valor de la calificación del estudiante.
     * @return Valor de la calificación del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Devuelve si la calificación es mayor o igual a 5.
     * @return Valor true en caso afirmativo, valor false en caso no afirmativo.
     */
    public boolean aprobo() {
        return calificacion >= APROBADO;
    }

    /**
     * Devuelve la edad dividida entre 12 (sin decimales).
     * @return Edad entre 12 sin decimales.
     */
    public int edadEscolar() {
        return edad / EDADESCOLAR;
    }

    /**
     * Devuelve si la edad es mayor o igual a 18.
     * @return Valor true en caso afirmativo, valor false en caso no afirmativo.
     */
    public boolean esUniversitario() {
        return edad >= EDADMAYOR;
    }

    /**
     * Muestra por pantalla los atributos del estudiante.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}
