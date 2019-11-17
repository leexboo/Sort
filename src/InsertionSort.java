import java.util.Arrays;

/**
 * 插入排序 时间复杂度为O(n^2)
 */
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

    /**
     * 先将要交换的位置的值暂存，然后依次往前对比，如果比这个元素大则向后移动
     * 直到没有对比到比这个元素小的元素，那么就插入要交换的元素
     */
    public static void InsertionSort2(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            int j = i;
            for(; j > 0; j--){
                if(temp < arr[j-1]){
                    arr[j] = arr[j - 1];
                }else{
                    break;
                }
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2 , 2 , 4, 0 , -1 , 9 , 3};
        System.out.println("原数组:" + Arrays.toString(arr));
//        InsertionSort(arr);
        InsertionSort2(arr);
        System.out.println("排序后的数组:" + Arrays.toString(arr));
    }
}
