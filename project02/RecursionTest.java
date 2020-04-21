package project02;

import java.util.stream.IntStream;

public class RecursionTest {
    public static void main(String[] args) {
       /* int sum = 0;
        for (int i = 1;i <= 100;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        */
        System.out.println(new RecursionTest().getSum(4));
        System.out.println(new RecursionTest().getSum1(4));
        System.out.println(new RecursionTest().f(10));

        System.out.println(new RecursionTest().fibonacci(5));
    }
    //递归方法 1-100的合
    public int getSum(int n){

        if (n == 1){
            return  1;
        }else {
            return n + getSum(n - 1);
        }
    }
    //例题2：阶乘  1-100的乘积
    public int getSum1(int n){
         if (n == 1){
             return 1;
         }else {
             return n * getSum1(n - 1);
         }
    }
    //例题3：求函数
    public int f(int n){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }
    //例题4：斐波那契数列
    public int fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
