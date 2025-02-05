package com.pablo;

import java.util.Date;

public class Alumno extends Persona{
    String CodigoXade;
    boolean autorizaTutores;

    
    public String getCodigoXade() {
        return CodigoXade;
    }
    public void setCodigoXade(String codigoXade) {
        CodigoXade = codigoXade;
    }
    public boolean isAutorizaTutores() {
        return autorizaTutores;
    }
    public void setAutorizaTutores(boolean autorizaTutores) {
        this.autorizaTutores = autorizaTutores;
    }
    public Alumno() {
    }
    @Override
    public String toString() {
        return "Alumno [CodigoXade=" + CodigoXade + ", autorizaTutores=" + autorizaTutores + "]";
    }
    public Alumno(String dni, String nom, String apel1, String apel2, String correo, Integer movil, Date fecNac,
            String codigoXade, boolean autorizaTutores) {
        super(dni, nom, apel1, apel2, correo, movil, fecNac);
        CodigoXade = codigoXade;
        this.autorizaTutores = autorizaTutores;
    }
    public Alumno(String codigoXade, boolean autorizaTutores) {
        CodigoXade = codigoXade;
        this.autorizaTutores = autorizaTutores;
    }
}
