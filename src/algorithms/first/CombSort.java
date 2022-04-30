package algorithms.first;

import java.util.Arrays;

public class CombSort {
    static void comb_sort(int[] nums){
        int len_gap = nums.length;
        float shrink_val = 1.3f;
        boolean swap = false;
        while (len_gap > 1 || swap) {
            if (len_gap > 1) {
                len_gap = (int)(len_gap / shrink_val);
            }
            swap = false;
            for (int i = 0; len_gap + i < nums.length; i++){
                if (nums[i] > nums[i + len_gap]) {
                    swap(nums, i, i + len_gap);
                    swap = true;
                }
            }
        }
    }
    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static void main(String[] args){
        int[] nums = {6, 78, 90, -12, -45, 0, -1, 45};
        System.out.println("The original array contains ");
        System.out.println(Arrays.toString(nums));
        comb_sort(nums);
        System.out.println("The sorted array is ");
        System.out.println(Arrays.toString(nums));
    }
}
