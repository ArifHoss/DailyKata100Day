package week_02;

public class Kata_02_CalculateBMI {
// bmi function calculates body mass index(bmi = weight/(height*height))
    public static String bmi(double weight, double height) {
        double BMI = weight / (height * height);
        if (BMI <= 18.5) return "Underweight";
        if (BMI <= 25.0) return "Normal";
        if (BMI <= 30.0) return "Overweight";
        return "Obese";
    }
}
