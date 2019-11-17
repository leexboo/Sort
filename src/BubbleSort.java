import java.util.Arrays;

/**
 * 通过从左到右不断交换相邻的元素，在一轮的交换之后，最大的元素在最后一个位置
 * 然后再次从左到右交换，剩下的元素中最大的元素在倒数第二个
 * 冒泡排序的时间复杂度为O(n^2)，无额外的空间
 */
public class BubbleSort {
    public static void BubbleSort(int[] arr){
        boolean swapped = false;
        for(int i = arr.length - 1; i > 0; i-- ){  //从最后一个开始确定
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr , j ,j + 1);
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
        BubbleSort(arr);
        System.out.println("排序后的数组:" + Arrays.toString(arr));
    }
}
