package src;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{ 2,3,5,7,11,13,17,19 };
        int[] arr2;
        for (int i = 0;i < arr1.length;i++){
            System.out.print( arr1[i] + " ");
        }
        System.out.println();

       // arr2 = arr1;//只是把1的地址给了2，修改了数组2的内容 ，数组1 也会跟着一起修改
        arr2 = arr1.clone();
        for (int i = 0;i < arr2.length;i++){
            if ( i % 2 == 0){
                arr2[i] = i;
            }
            System.out.print( arr2[i] + " ");
        }
        System.out.println();
        //重新遍历数组1
        for (int i = 0;i < arr1.length;i++){
            System.out.print( arr1[i] + " ");
        }
    }
}
