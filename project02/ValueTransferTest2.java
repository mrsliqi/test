package project02;

public class ValueTransferTest2 {
    public static void main(String[] args) {
        Date date = new Date();
        date.m = 10;
        date.n = 30;
        System.out.println("m = " + date.m + ",n = " + date.n);

        //交换m n
        ValueTransferTest2 test2 = new ValueTransferTest2();
        test2.swap(date);

        System.out.println("m = " + date.m + ",n = " + date.n);
    }
    public void swap(Date date){
        int temp = date.m;
        date.m = date.n;
        date.n = temp;
    }
}
class Date{
    int m;
    int n;
}