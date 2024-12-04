package ud03.javaManual;

import java.util.Date;

public class Persona {
    //Atributos
    String dni;
    String nombre;
    String apellido1;
    String apellido2;
    String correo;
    Integer movil;
    Date fecNacimiento;
    //Métodos
    public Persona(){
        
    }
    public Persona(String nom, String apel){
        nombre = nom;
        apellido1 = apel;
    }
}