package week_02;

import static week_02.Kata_01_ValidatePinCode.*;
import static week_02.Kata_02_CalculateBMI.bmi;
import static week_02.Kata_extra_FakeBinary.fakeBin;
import static week_02.Kata_extra_FakeBinary.fakeBinary;

public class Main {
    public static void main(String[] args) {
        System.out.println(validatePin("123")); // kata 01
        System.out.println(validatePin("1234")); // kata 01
        System.out.println(validatePin2("123")); // kata 01
        System.out.println(validatePin2("1234")); // kata 01
        System.out.println(bmi(80, 1.80)); // kata 02
        System.out.println(bmi(100, 1.80)); // kata 02
        System.out.println(fakeBin("123456789"));
        System.out.println(fakeBinary("123456789"));


    }
}
