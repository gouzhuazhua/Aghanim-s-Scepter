package Sort.exchange;

import Sort.Sort;

/**
 * @param <T>
 * 冒泡排序
 */
public class BubbleSort<T extends Comparable<T>> extends Sort<T> {


    /**
     * @param nums
     * 1，一次遍历可以将最大的一个数上浮到最右边；
     * 2，通过~N^2次操作可以完成交换操作。
     */
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for(int i = N - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(!less(nums[j], nums[j+1])) {
                    swap(nums, j, j+1);
                }
            }
        }
    }
}
