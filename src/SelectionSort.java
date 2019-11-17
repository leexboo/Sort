import java.util.Arrays;

/**
 * 时间复杂度为O(n^2)，无额外的空间
 * 选择排序，表现最稳定的排序算法之一，无论什么数据进去都是O(n^2)的时间复杂度
 */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                swap(arr , i , minIndex);
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
        selectionSort(arr);
        System.out.println("排序后的数组:" + Arrays.toString(arr));
    }
}
