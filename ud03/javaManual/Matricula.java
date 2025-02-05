package ud03.javaManual;

public class Matricula {
    Alumno alumno;
    Modulo modulo;
    Integer nota;
    String curso;
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public Integer getNota() {
        return nota;
    }
    public void setNota(Integer nota) {
        this.nota = nota;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString() {
        return "Matricula [alumno=" + alumno + ", modulo=" + modulo + ", nota=" + nota + ", curso=" + curso + "]";
    }
    public Matricula(Alumno alumno, Modulo modulo, Integer nota, String curso) {
        this.alumno = alumno;
        this.modulo = modulo;
        this.nota = nota;
        this.curso = curso;
    }
    public Matricula() {
    }
    
}
