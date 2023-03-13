package pack7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Test {




    public static int[] divideArrayElements(int[] arr, int divisor) throws IllegalArgumentException {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            try {
                result[i] = arr[i] / divisor;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Division by zero occurred", e);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int divisor = 5;
        int[] result = null;
        try {
            result = divideArrayElements(arr, divisor);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        if (result != null) {
            System.out.println(Arrays.toString(result));
        }
    }
}
