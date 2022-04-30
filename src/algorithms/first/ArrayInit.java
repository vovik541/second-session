package algorithms.first;

import java.util.Random;

public class ArrayInit {

    public static int[] createArray(int size){
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = Math.abs(random.nextInt() % 10000);
        }
        return array;
    }

    public static int[] createBalanced(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = i;
        }
        return array;
    }

    public static int[] createReversed(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = size-i;
        }
        return array;
    }

    public static void print(int[] array){
        System.out.print(array[0] + " ");
        for (int i = 1; i < array.length; ++i) {
            System.out.print(array[i] + " ");
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }
}
