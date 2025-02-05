package Pablo;

public class EmailValidator {
    public EmailValidator() {

    }

    public boolean isValid(String email){

        int arroba = email.indexOf('@');
        if (arroba == -1 || arroba == 0){
            return false;
        }

        String punto = email.substring(arroba + 1);
        if (punto.indexOf('.') == -1 || punto.indexOf('.') == 0 || punto.indexOf('.') == punto.length() - 1) {
            return false;
        }

        return true;
    }

}
