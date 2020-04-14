package project02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.eat();
        cust.getNation("中国");
    }
}
//客户类
class Customer{
    String name;
    int age;
    boolean isMal;
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("休息了几个小时");
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation) {
        String info = "我的国籍是" + nation;
        System.out.println(info);
        return nation;
    }
}
