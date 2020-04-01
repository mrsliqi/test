package src;

public class ArrayValue {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int) (Math.random()*( 99 - 10 + 1)+ 10);
           // System.out.println(arr[i]);
        }
          //遍历数组
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
           //总和
           int sum = 0;
           double avg = 0;
           for (int i = 0;i < arr.length;i++){
               sum = sum + arr[i];
           }
           avg = sum / 10.0;
           System.out.println("和：" + sum);
           System.out.println("平均值：" + avg);

           //最大值
           int max = 0;
           for (int i = 0;i < arr.length;i++){
               if (max < arr[i]){
                   max = arr[i];
               }
           }
           System.out.println("最大值：" + max);

           //最小值
           int min = arr[0];
           for (int i = 1;i < arr.length;i++){
               if (min > arr[i]){
                   min = arr[i];
               }
           }
           System.out.println("最小值：" + min);


    }
}
