package week_02;

public class Kata_03_LostWithoutAMap {
    public static int[] map(int[] arr) {
        //return a new array with each value double

        int length = arr.length;
//        int[] doubleArr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
}
