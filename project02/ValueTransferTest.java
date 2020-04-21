package project02;

public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = m;
        System.out.println("m=" + m + ",n=" + n);
        n = 20;
        System.out.println("m=" + m + ",n=" + n);
        System.out.println("*************引用数据类型**************");
        Order o1 = new Order();
        o1.OrderId = 100;
        Order o2 = o1;
        System.out.println("o1.Orderd=" + o1.OrderId + ",o2.Orderd=" + o2.OrderId);
        o2.OrderId = 102;
        System.out.println("o1.Orderd=" + o1.OrderId + ",o2.Orderd=" + o2.OrderId);
        System.out.println("********************************************");
        //m n 交换
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m=" + m + ",n=" + n);
    }
}
class Order{
    int OrderId;
}