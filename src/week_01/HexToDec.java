package week_01;

public class HexToDec {
    public static void main(String[] args) {
        String one = "1";
        String two = "2";
        String three = "a";
        String ten = "10";
        String four = "FF";
        String twelve = "-C";
        System.out.println(hexToDec(one));
        System.out.println(hexToDec(two));
        System.out.println(hexToDec(three));
        System.out.println(hexToDec(four));
        System.out.println(hexToDec(ten));
        System.out.println(hexToDec(twelve));

    }
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }
}
