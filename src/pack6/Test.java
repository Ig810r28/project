package pack6;

public class Test {
    public static void printMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < min) {
                    min = diff;
                }
            }
        }
        System.out.println("Мінімальне число: "  + min);
    }

    public static void main(String[] args) {
        int[] arr = {5, 11, 7, 20};
        printMin(arr);
    }


}
