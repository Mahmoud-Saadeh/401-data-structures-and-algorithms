import MergeSort.MergeSort;
import QuickSort.QuickSort;

public class Blog {
  public static void main(String[] args) {
    int[] arr = { 8,4,23,42,16,15 };

//    MergeSort mergeSort = new MergeSort();
//    mergeSort.mergeSort(arr);
    QuickSort quickSort = new QuickSort();
    quickSort.quickSort(arr,0, arr.length - 1);

    for (int num: arr) {
      System.out.println(num);
    }
  }
}
