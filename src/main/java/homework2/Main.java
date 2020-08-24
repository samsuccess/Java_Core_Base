package homework2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        reverseNum(10, 2);
//        fillArr();
//        multiply();
//        int[][] corners = new int[5][5];
//        arr2D(corners);
//        System.out.println(maxNum(10, 10));
//        System.out.println(minNum(10, 10));
    }


    static void reverseNum(int size, int diff) {
        Random random = new Random();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(diff);
        }
        System.out.println(Arrays.toString(arr));

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillArr() {
        int[] intArray = new int[8];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 3;
        }
        System.out.println(Arrays.toString(intArray));
    }

    static void multiply() {
        int[] multiArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiArr.length; i++) {
            if (multiArr[i] < 6) {
                multiArr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(multiArr));
    }

    static void arr2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][(arr.length - 1) - i] = 1;
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    static int maxNum(int n, int diff){
        Random random = new Random();
        int[] maxi = new int[n];
        int i;
        for (i = 0; i < maxi.length; i++) {
            maxi[i] = random.nextInt(diff);
        }
        System.out.println(Arrays.toString(maxi));
        int max = maxi[0];
        for (i = 0; i < maxi.length; i++) {
            if(max < maxi[i] ){
                max = maxi[i];
            }
        }
        return max;
    }

    static int minNum(int n, int diff){
        Random random = new Random();
        int[] mini = new int[n];
        int i;
        for (i = 0; i < mini.length; i++) {
            mini[i] = random.nextInt(diff);
        }
        System.out.println(Arrays.toString(mini));
        int min = mini[0];
        for (i = 0; i < mini.length; i++) {
            if(min > mini[i] ){
                min = mini[i];
            }
        }
        return min;
    }
}
