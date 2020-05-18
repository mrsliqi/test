package project06;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        Bank bank1 = Bank.getInstance();
        System.out.println(bank == bank1);
    }

}
//饿汉式
class Bank{
    //1.私有化 类的构造器
    private Bank(){
    }
    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();
    //3.提供公共方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
