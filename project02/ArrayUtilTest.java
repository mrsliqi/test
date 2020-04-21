package project02;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] abc = new int[]{59,29,86,43,83,8,3893,862,589,3,86};
        util.print(abc);
        int max = util.getMax(abc);
        System.out.println("最大值为：" + max);
        int min = util.getMin(abc);
        System.out.println("最小值为：" + min);
        int sum = util.getSum(abc);
        System.out.println("总和：" + sum);
        int avg = util.getAvg(abc);
        System.out.println("平均值：" + avg);
        System.out.print("复制数组：");
        util.copy(abc);
       /* System.out.print("数组反转之后：");
        util.reverse(abc);
        util.print(abc);*/
        System.out.print("排序前：");
        util.print(abc);
        System.out.print("排序后：");
        util.sort(abc);
        util.print(abc);
        System.out.print("要查找元素所在位置：");
        util.getIndex(abc,83);

    }
}
