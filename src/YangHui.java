package src;

public class YangHui {
    public static void main(String[] args) {
        int[][] array = new int[10][];
        //给数组元素肤赋值
        for (int i = 0;i <array.length;i++) {
            array[i] = new int[i + 1];
            //每行的首末元素赋值
            array[i][0] = 1;
            array[i][i] = 1;
            //每行的其他元素赋值
            for (int j = 1; j < array[i].length-1;j++){
                array[i][j] = array[i-1][j-1] + array[i-1][j];
            }
        }

        //遍历数组
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
