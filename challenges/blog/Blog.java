import MergeSort.MergeSort;

public class Blog {
  public static void main(String[] args) {
    int arr[] = { 8,4,23,42,16,15 };

    MergeSort mergeSort = new MergeSort();
    mergeSort.mergeSort(arr);

    for (int num: arr) {
      System.out.println(num);
    }
  }
}
