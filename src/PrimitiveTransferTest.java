package src;

public class PrimitiveTransferTest {
    public static void spay(int a , int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("spay函数中a的值：" + a + "，b的值：" + b);
    }
    public static void main(String[] args) {
        int a=6;
        int b=9;
        spay(a,b);
        System.out.println("交换结束后a的值：" + a + "，b的值：" + b);
    }
}
