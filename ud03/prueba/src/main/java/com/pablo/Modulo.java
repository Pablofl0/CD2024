package com.pablo;

public class Modulo {
    String codigo;
    String nombre;
    String descripcion;
    Integer horas;
    Integer sesiones;
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public Integer getSesiones() {
        return sesiones;
    }
    public void setSesiones(Integer sesiones) {
        this.sesiones = sesiones;
    }
    @Override
    public String toString() {
        return "Modulo [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", horas=" + horas
                + ", sesiones=" + sesiones + "]";
    }
    public Modulo(String codigo, String nombre, String descripcion, Integer horas, Integer sesiones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.sesiones = sesiones;
    }
    public Modulo() {
    }
    
}
