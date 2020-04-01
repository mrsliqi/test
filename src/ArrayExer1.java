package src;
/*
   1、把多个相同类型数据按一定的顺序排列的集合，并使用同一个名字，用编号的方式进行管理
   2、数组名  元素  角标  下标  索引 数组的长度  元素的个数
   3、一维数组的生命和初始化
      如何调用数组的指定位置的元素
      如何获取数组的长度
      如何遍历数组
      数组元素的默认初始化
      数组内存解析
*/
public class ArrayExer1 {
    public static void main(String[] args) {
        //声明  初始化
        int[] ids ;
        //静态初始化
        ids = new int[]{1001,1002,1003};
        //动态初始化
        String[] names = new String[5];
        System.out.println(names.length);


        int[][] arr = new int[][]{{3,5,8,0},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j=0;j < arr[i].length; j++){
                sum = arr[i][j] + sum;
            }
        }
        System.out.println("总和：" + sum);
    }
}
