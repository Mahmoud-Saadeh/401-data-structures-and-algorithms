import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {-131, -82, 0, 27, 42, 68, 179};
        int[] arr2 = {11, 22, 33, 44, 55, 66, 77};

        int length = arrLength(arr);
        System.out.println(BinarySearch(arr,42));
        System.out.println(BinarySearch(arr2,90));

    }

    public static int arrLength(int[] arr){
        int lengthValue = 0;
        for (int el : arr) {
            lengthValue = lengthValue +1;
        }
        return lengthValue;
    }

    public static int BinarySearch(int[] arr,int value){
       int arrayLength = arrLength(arr);
       int highIndex = arrayLength - 1;
       int lowIndex = 0;

       while(lowIndex <= highIndex){
           int middleIndex = ((lowIndex + highIndex) / 2);
           if(arr[middleIndex] > value){
               highIndex = middleIndex - 1;
           } else if(arr[middleIndex] < value){
               lowIndex = middleIndex + 1;
           }else{
               return middleIndex;
           }
           
       }
       return  -1;
    }
}