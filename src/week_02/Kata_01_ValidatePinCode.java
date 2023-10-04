package week_02;

public class Kata_01_ValidatePinCode {
    public static void main(String[] args) {
        System.out.println(validatePin2("1243"));
    }


    public static boolean validatePin2(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }

    public static boolean validatePin(String pin) {
        if (pin == null || (pin.length()!= 4 && pin.length() != 6)){ return false;}

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
