package ch05;

import java.util.Arrays;

public class Ex5_practice {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] arr1 = {0,1,2,3,4};
        System.out.println(arr == arr1);
        System.out.println(Arrays.equals(arr, arr1));

        int[][] arr2D = {{11,12}, {21,22}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa"},{"bbb"}};
        String[][] str2D2 = {{"aaa"},{"bbb"}};
        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));
    }
}
