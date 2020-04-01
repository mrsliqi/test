package src;
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        lable:for (int i = 2 ;i <= 100000;i++){
               for (int j = 2;j <= Math.sqrt(i);j++){
                  if (i % j == 0 ){
                    continue lable;
                  }
               }
            count = count + 1;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数：" + count);
        System.out.println("所用时间：" + (end - start));
    }
}