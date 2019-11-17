import sun.security.util.Length;

import java.util.Arrays;

/**
 * 通过从左到右不断交换相邻的元素，在一轮的交换之后，最大的元素在最后一个位置
 * 然后再次从左到右交换，剩下的元素中最大的元素在倒数第二个
 * 冒泡排序的时间复杂度为O(n^2)，无额外的空间
 */
public class BubbleSort {
    /**
     * 原始版冒泡排序
     */
    public static void BubbleSort(int[] arr){
        boolean swapped = false;   //作为是否有进行交换的标志
        for(int i = 0; i < arr.length - 1; i++ ){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    swapped = true;
                    swap(arr , j ,j + 1);
                }
            }
            //如果数组没有进行交换，表示此时数组已经有序，则表示不用进行交换了
            if(!swapped){
                break;
            }
        }
    }

    /**
     *改进版冒泡排序
     */
    public static void BubbleSort2(int[] arr){
        int lastIndex = 0;  //最后一次交换的下标
        int arrBoundary = arr.length - 1;
        boolean swapped = false;   //作为是否有进行交换的标志
        for(int i = 0; i < arrBoundary; i++ ){  //从最后一个开始确定
            for(int j = 0; j < arrBoundary - i; j++){
                if(arr[j] > arr[j + 1]){
                    swapped = true;
                    swap(arr , j ,j + 1);
                    lastIndex = j + 1;//最后一次交换的位置
                }
            }
            arrBoundary = lastIndex;
            //如果数组没有进行交换，表示此时数组已经有序，则表示不用进行交换了
            if(!swapped){
                break;
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
//        BubbleSort(arr);
        BubbleSort2(arr);
        System.out.println("排序后的数组:" + Arrays.toString(arr));
    }
}
