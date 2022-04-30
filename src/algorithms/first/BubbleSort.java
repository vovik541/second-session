package algorithms.first;

import static algorithms.first.ArrayInit.*;

public class BubbleSort {

    private static int count = 0;
    private static int swapped = 0;
    public static void bubbleSort(int[] array) {
        boolean isSorted;
        for (int i = 0; i < array.length - 1; ++i) {
            isSorted = true;
            for (int j = 0; j < array.length - i - 1; ++j) {
                count++;
                if (array[j + 1] < array[j]) {
                    isSorted = false;
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    swapped++;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int size = 50000;
//        int[] array = createArray(size);
//        int[] array = createBalanced(size);
        int[] array = createReversed(size);


        long begin = System.nanoTime();
        bubbleSort(array);
        long end = System.nanoTime();
        System.out.printf("\n\n it took %f milli seconds to sort the array\n", (end - begin) /1000000.);




    }

}
