import java.util.Arrays;

/**
 * 先将数组根据增量分组，然后对每一组进行插入排序
 * 然后减少增量进行分组，再对分组后的结果进行插入排序
 * 时间复杂度看具体增量而定O(n^2)
 */
public class ShellSort {
    public static void ShellSort(int[] arr){
        for(int h = arr.length / 2; h > 0 ; h = h / 2){
            for(int i = 0; i < arr.length; i = i + h){
                int e = arr[i];
                int j = i;
                for(; j > 0; j = j - h){
                    if(e < arr[j - h]){
                        arr[j] = arr[j - h];
                    }else{
                        break;
                    }
                }
                arr[j] = e;
            }
        }
    }

    public static void ShellSort2(int[] arr) {
        int n = arr.length;
        // 计算 increment sequence: 1, 4, 13, 40, 121, 364, 1093...
        int h = 1;
        while (h < n / 3) h = 3 * h + 1;
        System.out.println(h);
        while (h >= 1) {
            // h-sort the array
            for (int i = h; i < n; i++) {
                // 对 arr[i], arr[i-h], arr[i-2*h], arr[i-3*h]... 使用插入排序
                int e = arr[i];
                int j = i;
                for (; j >= h && e < arr[j - h]; j -= h){
                    arr[j] = arr[j - h];
                }
                arr[j] = e;
            }
            h /= 3;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2 , 2 , 4, 0 , -1 , 9 , 3};
        System.out.println("原数组:" + Arrays.toString(arr));
//        ShellSort(arr);
        ShellSort2(arr);
        System.out.println("排序后的数组:" + Arrays.toString(arr));
    }
}
