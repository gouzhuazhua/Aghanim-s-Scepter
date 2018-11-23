import Sort.Sort;
import Sort.exchange.BubbleSort;
import Sort.insert.InsertionSort;
import Sort.select.SelectionSort;

public class manage {
    public static void main(String[] args) {
        Comparable[] nums = {4, 5, 2, 0, 9, 11, 7, 1};
        Sort selectionSort = new SelectionSort();
        Sort bubbleSort = new BubbleSort();
        Sort insertionSort = new InsertionSort();
//        selectionSort.sort(nums);
//        bubbleSort.sort(nums);
        insertionSort.sort(nums);
        for(Comparable num : nums) {
            System.out.println(num);
        }

    }
}
