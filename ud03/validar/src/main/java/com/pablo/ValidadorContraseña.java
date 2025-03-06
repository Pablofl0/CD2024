package com.pablo;

/**
 * Hello world!
 *
 */
public class ValidarContraseña {
    private String contraseña;

    public boolean esValida(String contraseña){
        boolean mayus = false;
        boolean minus = false;
        boolean numero = false;
        boolean especial = false;

        if (contraseña.length() == 8) {
            for (int i = 0; i < contraseña.length; i++) {
                if ((int)contraseña.charAt(i) >= (int)'A' && (int)contraseña.charAt(i) <= (int)'Z') {
                    mayus = true;
                }
                else if ((int)contraseña.charAt(i) >= (int)'a' && (int)contraseña.charAt(i) <= (int)'z') {
                    minus = true;
                }
                else if ((int)contraseña.charAt(i) >= (int)'0' && (int)contraseña.charAt(i) <= (int)'9') {
                    numero = true;
                }
                else{
                    especial = true;
                }
            }
        }
        if (especial == true && mayus == true && minus == true && numero == true) {
            return true;
        }
        else{
            return false;
        }
    }
}
