import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int length = arrLength(arr);
        int[] reversedArr2 = insertShiftArray(arr,7);
        System.out.print(Arrays.toString(reversedArr2));

}

    public static int arrLength(int[] arr){
        int lengthValue = 0;
        for (int el : arr) {
            lengthValue = lengthValue +1;
        }
        return lengthValue;
    }

    public static int findMiddle(int[] arr){
        int arrayLength = arrLength(arr);
        int middle = arrayLength/2;
        if(arrayLength % 2 == 0){
            return middle;
        }else{
            return middle + 1;
        }
    }

    public static int[] insertShiftArray(int[] arr, int value){
        int arrayLength = arrLength(arr);
        int[] newArr = new int[arrayLength + 1];
        int middle = findMiddle(arr);
        newArr[middle] = value;
        for (int i = 0; i < arrayLength + 1; i++){
            if(i > middle){
                newArr[i] = arr[i -1];
            }
            if(i < middle){
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }
}