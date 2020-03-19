public class PrimeNumberTest {
    public static void main(String[] args) {

        long start=System.currentTimeMillis();//当前时间距离1970年01-01  00:00:00 的时间
        int count = 0;//记录个数
        for (int a = 2;a <= 10000;a++){
            boolean isFlag = true;//标识a是否被除尽
            for (int b = 2;b <= Math.sqrt(a); b++){
                if (a % b == 0 ){
                   isFlag = false;
                   break;//只对非质数的自然数是有效的
                }
            }
            if (isFlag == true){
               // System.out.println(a + "是质数");
                count = count + 1;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("所花费的时间：" + (end - start));
        System.out.println("质数的数量：" + count);
    }
}
