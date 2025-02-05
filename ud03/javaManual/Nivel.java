package ud03.javaManual;

public class Nivel {
    String nivel;

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Nivel() {
    }

    @Override
    public String toString() {
        return "Nivel [nivel=" + nivel + "]";
    }

    public Nivel(String nivel) {
        this.nivel = nivel;
    }
    
}
