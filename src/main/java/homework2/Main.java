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
//        arr[i] = 1 - arr[i];  ещё варианты
//        arr[i] = arr[i] == 0 ? 1 : 0;
//        arr[i] ^= 1;
        System.out.println(Arrays.toString(arr));
    }

    static void fillArr() {
        int[] intArray = new int[8];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 3;
//          intArray[i] = intArray[i - 1] + 3; ещё вариант при i = 1 в цикле
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

//    public static int [][] factoryArr(int n){ ещё варианты
//        int [][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            arr[i][i] = 1;
//            arr[i][n - 1 - i] = 1;
//        }
//       return arr;
//    }
//    public static int [][] factoryArr(int n){
//        int [][] arr = new int[n][n];
//        for (int i = 0; i < n; i++){
//        for ( int j = 0; i < n; i++){
//              if (i == j || i + j == n - 1){
//            arr[i][j] = 1;
//               }
//            }
//        }
//       return arr;
//    }

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

    public static boolean checkBalance(int[] arr){
        int allSum = 0;
        for (int i = 0; i < arr.length; i++) {
            allSum += arr[i];
        }
        if(allSum % 2 != 0){
            return false;
        }
        int leftSum = 0;
        int i = 0;
        while (leftSum < allSum / 2){
            leftSum += arr[i];
            i ++;
        }
        return leftSum == allSum /2;
    }

    public static int[] shiftArr(int[] arr, int shift){
        int counter = shift % arr.length + arr.length; //здесь приводится отрицательный сдвиг(влево) к положительному
        for (int i = 0; i < shift; i++) {
            int rightEdge = arr[arr.length - 1]; // здесь запоминается крайний правый элемент
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1]; // здесь происходит сам сдвиг вправо
            }
            arr[0] = rightEdge;
        }
        return arr;
    }
}
