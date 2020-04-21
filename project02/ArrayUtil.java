package project02;
public class ArrayUtil {

    /**  最大值
     *
     * @param abc
     * @return
     */
    public int getMax(int[] abc){
        int maxValue = abc[0];
        for (int i = 0;i < abc.length;i++){
            if (maxValue < abc[i]){
                maxValue = abc[i];
            }
        }
        return maxValue;
    }

    /** 最小值
     *
     * @param abc
     * @return
     */
    public int getMin(int[] abc){
        int minValue = abc[0];
        for (int i = 0;i < abc.length;i++){
            if (minValue > abc[i]){
                minValue = abc[i];
            }
        }
        return minValue;
    }

    /** 总和
     *
     * @param abc
     * @return
     */
    public int getSum(int[] abc){
        int sum = 0;
        for (int i = 0;i < abc.length;i++){
            sum = sum + abc[i];
        }
        return sum;
    }

    //平均值
    public int getAvg(int[] abc){

        return getSum(abc)/abc.length;
    }
    //反转数组
    public void reverse(int[] abc){
        for (int i = 0;i < abc.length / 2;i++){
            int temp = abc[i];
            abc[i] = abc[abc.length- 1 - i];
            abc[abc.length - 1 - i ] = temp;
        }
    }
    //复制数组
    public int[] copy(int[] abc){
        int[] abc1 = new int[abc.length];
        for (int i = 0;i < abc.length;i++){
            abc1[i] = abc[i];
            System.out.print(abc1[i] + " ");
        }
        System.out.println();
        return abc1;
    }
    //数组排序
    public void sort(int[] abc){
        for (int i = 0;i < abc.length - 1;i++){
            for (int j = 0;j < abc.length - 1 -i;j++){
                if (abc[j] > abc[j + 1]){
                    int temp = abc[j];
                    abc[j] = abc[j + 1];
                    abc[j + 1] = temp;
                }
            }
        }
    }
    //遍历
    public void print(int[] abc){
         for (int  i = 0;i < abc.length;i++){
             System.out.print(abc[i] + " ");
         }
        System.out.println();
    }
    //指定元素
    public int getIndex(int[] abc,int dest){
        for (int i = 0;i < abc.length;i++){
            if (dest == abc[i]){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
