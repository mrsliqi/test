package src;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{45,56,25,94,526,75,416,16,56};
        //冒泡
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 - i;j++){
                if (arr[j] > arr [j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        //遍历数组
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
