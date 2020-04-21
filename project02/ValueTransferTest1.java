package project02;

public class ValueTransferTest1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        ValueTransferTest1 test1 = new ValueTransferTest1();
        test1.swap(m,n);
        System.out.println("m=" + m + ",n=" + n);
    }
    //交换两个变量值得方法
    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }
}

