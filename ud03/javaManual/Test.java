package ud03.javaManual;

public class Test {
    public static void main(String[] args) {
        Persona mengano;

        mengano = new Persona();
        mengano.nombre = "Pepe";
        mengano.dni = "jj";
        mengano.setdni("12345678G");
        
        System.out.println(mengano.nombre);
    }
}
