package Sort.select;

import Sort.Sort;

/**
 * @param <T>
 * 选择排序
 */
public class SelectionSort<T extends Comparable<T>> extends Sort<T> {


    /**
     * @param nums
     * 从数组第一个位置开始，比较其位置上的元素与之后所有元素的大小，如果后者比前者小则交换两者顺序；
     * ~N^2次比较，~N次交换；
     * 对于一个排好序的数组也要进行如上次操作。
     */
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for(int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if(less(nums[j], nums[min])) {
                    min = j;
                }
            }
            swap(nums, i, min);
        }
    }
}
