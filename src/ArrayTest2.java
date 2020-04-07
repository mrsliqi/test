package src;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ","DD","MM","AA"};

        //数组的赋值  如果复制的话直接
        String[] arr1 = new String[arr.length];
        for (int i = 0;i < arr.length;i++){
            arr1[i] = arr[i];
        }
        /*
        for (int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        */
        /*//方法一：
        for (int i = 0;i < arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        */
        /*//方法二：
        for (int i = 0,j = arr.length-1;i < j;i++,j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/

        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //查找

        boolean isFlag = true;
        String dec = "MM";
        for (int i = 0;i < arr.length;i++){
            if (dec.equals(arr[i])){
                System.out.println("找到了要找的元素，位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("不存在要找的元素");
        }
        //二分法查找  前提需要查找的数组必须有序
        boolean isFlag1 = true;
        int[] arr2 = new int[]{-98,-34,12,23,25,36,48,59,89};
        int dos = 24;
        int head = 0;//初始索引
        int end = arr2.length - 1;
        while (head <= end){
            int middle = (head + end) / 2;
            if (dos == arr2[middle]){
                System.out.println("找到了指定元素，位置为：" + middle);
                isFlag1 = false;
                break;
            }else if (dos < middle){
                end = middle - 1;
            }else {
                head = head + 1;
            }
        }
        if (isFlag1){
            System.out.println("不存在要找的元素");
        }
    }
}
