class InsertionSort {
  public static void main(String[] args) {
    int arr[] = { 8,4,23,42,16,15 };

    InsertionSort insertionSort = new InsertionSort();
    insertionSort.sort(arr);

    for (int num: arr) {
      System.out.println(num);
    }
  }

  void sort(int arr[]) {
    int length = arr.length;
    for (int i = 1; i < length; ++i) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }
}
