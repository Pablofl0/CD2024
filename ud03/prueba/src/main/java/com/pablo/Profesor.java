package com.pablo;

import java.util.Date;

public class Profesor extends Persona{
    String especialidad;
    String cuerpo;
    Boolean sustituto;
    Date fecOposicion;
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
    public Date getFecOposicion() {
        return fecOposicion;
    }
    public void setFecOposicion(Date fecOposicion) {
        this.fecOposicion = fecOposicion;
    }
    @Override
    public String toString() {
        return "Profesor [especialidad=" + especialidad + ", cuerpo=" + cuerpo + ", sustituto=" + sustituto
                + ", fecOposicion=" + fecOposicion + "]";
    }
    public Profesor(String especialidad, String cuerpo, Boolean sustituto, Date fecOposicion) {
        this.especialidad = especialidad;
        this.cuerpo = cuerpo;
        this.sustituto = sustituto;
        this.fecOposicion = fecOposicion;
    }
    public Profesor(String dni, String nom, String apel1, String apel2, String correo, Integer movil, Date fecNac,
            String especialidad, String cuerpo, Boolean sustituto, Date fecOposicion) {
        super(dni, nom, apel1, apel2, correo, movil, fecNac);
        this.especialidad = especialidad;
        this.cuerpo = cuerpo;
        this.sustituto = sustituto;
        this.fecOposicion = fecOposicion;
    }
    
}
