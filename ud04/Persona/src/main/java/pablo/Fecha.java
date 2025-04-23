package pablo;

/**
 * Clase fecha.
 */
public class Fecha {
    private static final int TREINTAYUNO = 31;
    private static final int DOCE = 12;
    private static final int TRES = 3;
    private static final int CINCO = 5;
    private static final int SIETE = 7;
    private static final int OCHO = 8;
    private static final int DIEZ = 10;
    private static final int CUATRO = 4;
    private static final int SEIS = 6;
    private static final int NUEVE = 9;
    private static final int ONCE = 11;
    private static final int TREINTA = 30;
    private static final int CUATROCIENTOS = 400;
    private static final int CIEN = 100;
    private static final int VEINTINUEVE = 29;
    private static final int VEINTIOCHO = 28;

    private int dia;
    /** Valor del día. */

    private int mes;
    /** Valor del mes. */

    private int anio;

    /** Valor del año. */

    public Fecha(int dia, int mes, int anio) {

        this.dia = dia;

        this.mes = mes;

        this.anio = anio;

    }

    /**
     * Valida la fecha.
     * @return True or False
     */
    public boolean valida() {

        if (dia < 1 || dia > TREINTAYUNO) {
            return false;
        }

        if (mes < 1 || mes > DOCE) {
            return false;
        }

        return true;

    }

    /**
     * Valida días del mes correctos.
     * @return Ture or False
     */
    public boolean validaDiasFinal() {
        if (dia > diasMes()) {
            return false;
        }
        return true;
    }

    /**
     * Devuelve días del mes.
     * @return días del mes
     */
    public int diasMes() {
        // determinamos la cantidad de días del mes:

        int diasMes = 0;

        switch (mes) {

            case 1:

            case TRES:

            case CINCO:

            case SIETE:

            case OCHO:

            case DIEZ:

            case DOCE:
                diasMes = TREINTAYUNO;
                break;

            case CUATRO:

            case SEIS:

            case NUEVE:

            case ONCE:
                diasMes = TREINTA;
                break;

            case 2: // verificación de año bisiesto
                return diasMesFebrero();
            default:
                break;

        }
        return diasMes;
    }

    /**
     * Devuelve el número de días de Febrero.
     * @return número días de Febrero
     */
    public int diasMesFebrero() {
        int diasMes = 0;
        if (anio % CUATROCIENTOS == 0 || anio % CUATRO == 0 && anio % CIEN != 0) {
            diasMes = VEINTINUEVE;
        } else {
            diasMes = VEINTIOCHO;
        }
        return diasMes;
    }
}
