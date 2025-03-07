package Pablo;

/**
 * Hello world!
 *
 */
public class ValidadorContraseña {
    public ValidadorContraseña(){

    }

    public boolean esValida(String contraseña){
        boolean mayus = false;
        boolean minus = false;
        boolean numero = false;
        boolean especial = false;

        if (contraseña.length() == 8) {
            for (int i = 0; i < contraseña.length(); i++) {
                if ((int)contraseña.charAt(i) >= (int)'A' && (int)contraseña.charAt(i) <= (int)'Z') {
                    mayus = true;
                }
                if ((int)contraseña.charAt(i) >= (int)'a' && (int)contraseña.charAt(i) <= (int)'z') {
                    minus = true;
                }
                if ((int)contraseña.charAt(i) >= (int)'0' && (int)contraseña.charAt(i) <= (int)'9') {
                    numero = true;
                }
                if (!(((int)contraseña.charAt(i) >= (int)'A' && (int)contraseña.charAt(i) <= (int)'Z') && ((int)contraseña.charAt(i) >= (int)'a' && (int)contraseña.charAt(i) <= (int)'z') && ((int)contraseña.charAt(i) >= (int)'0' && (int)contraseña.charAt(i) <= (int)'9'))) {
                    especial = true;
                }
            }
        }
        if (especial == true && mayus == true && minus == true && numero == true) {
            return true;
        }
        return false;
    }
}
