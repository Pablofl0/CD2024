package pablo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Clase de test de la clase Fecha.
 */
public class FechaTest {
    private static final int QUINCE = 15;
    private static final int SEIS = 6;
    private static final int DOSMIL = 2000;
    private static final int TREINTAYUNO = 31;
    private static final int TREINTA = 30;
    private static final int VEINTINUEVE = 29;
    private static final int VEINTIOCHO = 28;
    private static final int CUATRO = 4;
    private static final int NOVECIENTOS = 1900;
    private static final int VEINTITRES = 2023;
    private static final int VEINTICUATRO = 2024;

    private Fecha fechaCorrecta = new Fecha(20, 6, 2008);

    private Fecha mesMal1 = new Fecha(21, 0, 3000);

    private Fecha mesMal2 = new Fecha(21, 13, 3000);

    private Fecha diaMal1 = new Fecha(0, 11, 2000);

    private Fecha diaMal2 = new Fecha(32, 11, 2000);

    private Fecha diaMalNoviembre = new Fecha(31, 11, 2000);

    private Fecha diaBienDiciembre = new Fecha(31, 12, 2000);

    private Fecha diaMalFebrero = new Fecha(30, 2, 2008);

    private Fecha diaBienFebreroBisiesto1 = new Fecha(29, 2, 2008);

    private Fecha diaBienFebreroBisiesto2 = new Fecha(29, 2, 2000);

    private Fecha diaMalFebreroBisiesto1 = new Fecha(29, 2, 2007);

    private Fecha diaMalFebreroBisiesto2 = new Fecha(29, 2, 1900);

    /**
     * Test que valida las fechas.
     */
    @Test
    public void testValida() {

        assertTrue(fechaCorrecta.valida());

        assertFalse(mesMal1.valida());

        assertFalse(mesMal2.valida());

        assertFalse(diaMal1.valida());

        assertFalse(diaMal2.valida());

        assertTrue(diaMalNoviembre.valida());

        assertTrue(diaBienDiciembre.valida());

        assertTrue(diaMalFebrero.valida());

        assertTrue(diaBienFebreroBisiesto1.valida());

        assertTrue(diaBienFebreroBisiesto2.valida());

        assertTrue(diaMalFebreroBisiesto1.valida());

        assertTrue(diaMalFebreroBisiesto2.valida());

    }

    @Test
    public void testValidaDiasFinal() {
        Fecha fechaValida = new Fecha(QUINCE, SEIS, VEINTITRES);
        Fecha fechaInvalida = new Fecha(TREINTAYUNO, SEIS, VEINTITRES);

        assertTrue(fechaValida.validaDiasFinal(), "Debe ser una fecha válida dentro del mes");
        assertFalse(fechaInvalida.validaDiasFinal(), "El día no debe superar los días máximos del mes");
    }

    @Test
    public void testDiasMes() {
        Fecha enero = new Fecha(1, 1, VEINTITRES);
        Fecha abril = new Fecha(1, CUATRO, VEINTITRES);
        Fecha febrero = new Fecha(1, 2, VEINTITRES);

        assertTrue(enero.diasMes() == TREINTAYUNO, "Enero debería tener 31 días");
        assertTrue(abril.diasMes() == TREINTA, "Abril debería tener 30 días");
        assertTrue(febrero.diasMes() == VEINTIOCHO, "Febrero debería tener 28 días en un año no bisiesto");
    }

    @Test
    public void testDiasMesFebrero() {
        Fecha febreroNoBisiesto = new Fecha(1, 2, VEINTITRES);
        Fecha febreroBisiesto = new Fecha(1, 2, VEINTICUATRO);
        Fecha febreroSecularNoBisiesto = new Fecha(1, 2, NOVECIENTOS);
        Fecha febreroSecularBisiesto = new Fecha(1, 2, DOSMIL);

        assertTrue(febreroNoBisiesto.diasMesFebrero() == VEINTIOCHO, "Febrero en año no bisiesto debe tener 28 días");
        assertTrue(febreroBisiesto.diasMesFebrero() == VEINTINUEVE, "Febrero en año bisiesto debe tener 29 días");
        assertTrue(febreroSecularNoBisiesto.diasMesFebrero() == VEINTIOCHO, "1900 no es bisiesto, debe tener 28 días");
        assertTrue(febreroSecularBisiesto.diasMesFebrero() == VEINTINUEVE, "2000 es bisiesto, debe tener 29 días");
    }
}
