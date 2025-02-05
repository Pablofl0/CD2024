package com.pablo;

import java.time.LocalDate;


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
    
    public Alumno(String dni, String nombre, String apellido1, String apellido2, String correo, Integer movil,
            LocalDate fecNacimiento, String codigoXade, boolean autorizaTutores) {
        super(dni, nombre, apellido1, apellido2, correo, movil, fecNacimiento);
        CodigoXade = codigoXade;
        this.autorizaTutores = autorizaTutores;
    }
    
}
