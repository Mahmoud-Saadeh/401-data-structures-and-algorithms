package MergeSort;

public class MergeSort {

  public void mergeSort(int[] arr){
    int arrLength =  arr.length;

    if (arrLength > 1){
      int mid = arrLength/2;
      int[] left = new int[mid];
      int[] right = new int[arrLength - mid];

      System.arraycopy(arr, 0, left, 0, mid);
      for(int i =0; i<arrLength - mid; i++){
        right[i] = arr[i + mid];
      }

      mergeSort(left);
      mergeSort(right);

      merge(left,right,arr);
    }
  }

  private void merge(int[] left, int[] right, int[] arr){
    int i = 0;
    int j = 0;
    int k = 0;

    while (i<left.length && j < right.length){
      if (left[i] <= right[j]){
        arr[k] = left[i];
        i++;
      }else{
        arr[k] = right[j];
        j++;
      }
      k++;
    }

    if (i == left.length){
      while (j < right.length) {
        arr[k++] = right[j++];
      }
    }else {
      while (i < left.length) {
        arr[k++] = left[i++];
      }
    }
  }
}
