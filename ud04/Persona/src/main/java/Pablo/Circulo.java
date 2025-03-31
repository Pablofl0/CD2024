package Pablo;
/**
 * Clase Círculo capaz de crear objetos Círculo.
 */
public class Circulo {
    private int x; /** Valor de la primera coordenada del punto central. */
    private int y; /** Valor de la segunda coordenada del punto central. */
    private double radio; /** Valor del radio del círculo. */

    /**
     * Creación de un Círculo.
     * @param valorX Valor de la primera coordenada del punto central.
     * @param valorY Valor de la segunda coordenada del punto central.
     * @param valorRadio Valor del radio del círculo.
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Establece el valor de la primera coordenada del punto central.
     * 
     * @param valorX Valor de la primera coordenada del punto central.
     */
    public void establecerX(int valorX) {
        x=valorX;
    }

    /**
     * Devuleve el valor de la primera coordenada del punto central.
     * @return Valor de la primera coordenada del punto central.
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Devuelve el valor de la segunda coordenada del punto central.
     * @param valorY Valor de la segunda coordenada del punto central.
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    /**
     * Devuleve el valor de la segunda coordenada del punto central.
     * @return Valor de la segunda coordenada del punto central.
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Establece el valor del radio.
     * 
     * @param valorRadio Valor del radio del círculo.
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * Devuelve el valor del radio del círculo.
     * @return Valor del radio del círculo.
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Devuelve el valor del diámetro del círculo.
     * @return Diámetro del círculo (doble del radio).
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Devuelve el perímetro del círculo.
     * @return Perímetro del círculo.
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Devuelve el área del círculo.
     * @return Área del círculo.
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    /**
     * Método tostring mostrando punto central y radio.
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
