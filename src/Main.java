import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // the goal is not to reverse all elements in the array
        // it's just swap first and last element
        int[] arr = {1, 2, 3, 4, 5};
        swapElements(arr);
    }

    public static void swapElements(int[] arr) {
        System.out.println("Array before swap " + Arrays.toString(arr));
        int helper = 0;
        helper = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length - 1] = helper;

        System.out.println("Array after swap " + Arrays.toString(arr));
    }
}
