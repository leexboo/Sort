import java.util.Arrays;

public class InsertionSort {
    public static void InsertionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j - 1] > arr[j]){
                    swap(arr, j-1 , j);
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-2 , 2 , 4, 0 , -1 , 9 , 3};
        System.out.println("原数组:" + Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("排序后的数组:" + Arrays.toString(arr));
    }
}
