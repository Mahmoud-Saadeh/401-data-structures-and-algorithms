import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int length = arrLength(arr);
        int[] reversedArr2 = reverseArr(arr,length);
        System.out.print(Arrays.toString(reversedArr2));

}

    public static int arrLength(int[] arr){
        int lengthValue = 0;
        for (int el : arr) {
            lengthValue = lengthValue +1;
        }
        return lengthValue;
    }

    public static int[] reverseArr(int[] arr, int lengthValue){
        int[] reversedArr = new int[lengthValue];
        for (int i = lengthValue -1; i >= 0; i--) {
            int newIndex = lengthValue - i -1;
            reversedArr[newIndex] = arr[i];
        }
        return reversedArr;
    }
}