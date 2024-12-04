package ud03.javaManual;

public class TestPersona {
    public static void main(String[] args) {
        Persona julito; 
        Persona outro; 
        Persona fulano = new Persona();

        julito = new Persona("Julito", "Bla");
        outro = new Persona("Pepito","blu");

        //julito.nombre = "Julito";
        
        //outro.nombre = "Pepito";
        //outro.correo = "asdfasf@sdfasg";
        outro.toString();
    }
}
