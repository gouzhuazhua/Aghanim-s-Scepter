package Sort.insert;

import Sort.Sort;

/**
 * @param <T>
 * 插入排序
 */
public class InsertionSort<T extends Comparable<T>> extends Sort<T> {


    /**
     * @param nums
     * 1，从第一个元素开始，与之前元素比较，并插入到正确位置；
     * 2，插入排序每次只能交换相邻元素，令逆序数量减少1，因此插入排序需要交换的次数为逆序数量；
     * 3，最坏的情况是数组逆序，最好的情况是顺序；
     * 4，与打扑克时候的理牌类似；
     */
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for(int i = 0; i < N; i++) {
            for(int j = i; j > 0; j--) {
                if(less(nums[j], nums[j-1])) {
                    swap(nums, j, j-1);
                }
            }
        }
    }
}
