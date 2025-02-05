package com.pablo;

import java.time.LocalDate;


public class Profesor extends Persona{
    String especialidad;
    String cuerpo;
    Boolean sustituto;
    LocalDate fecOposicion;
    public Profesor(){

    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getCuerpo() {
        return cuerpo;
    }
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    public Boolean getSustituto() {
        return sustituto;
    }
    public void setSustituto(Boolean sustituto) {
        this.sustituto = sustituto;
    }
    public LocalDate getFecOposicion() {
        return fecOposicion;
    }
    public void setFecOposicion(LocalDate fecOposicion) {
        this.fecOposicion = fecOposicion;
    }
    @Override
    public String toString() {
        return "Profesor [especialidad=" + especialidad + ", cuerpo=" + cuerpo + ", sustituto=" + sustituto
                + ", fecOposicion=" + fecOposicion + "]";
    }

    public Profesor(String dni, String nombre, String apellido1, String apellido2, String correo, Integer movil,
            LocalDate fecNacimiento, String especialidad, String cuerpo, Boolean sustituto, LocalDate fecOposicion) {
        super(dni, nombre, apellido1, apellido2, correo, movil, fecNacimiento);
        this.especialidad = especialidad;
        this.cuerpo = cuerpo;
        this.sustituto = sustituto;
        this.fecOposicion = fecOposicion;
    }
    
}
