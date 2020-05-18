package project06;

public class SingletonTest2 {
    public static void main(String[] args) {
        Order order = Order.getInstance();
        Order order1 = Order.getInstance();
        System.out.println(order == order1);
    }
}
//懒汉式
class Order{
    //1.私有化类的构造器
    private Order(){
    }
    //2.声明当前类的对象
    //4.对象声明为static
    private static Order instance = null;
    //3.提供公共方法public,static，返回类的对象
    public synchronized static Order getInstance(){
        if (instance == null){
            instance = new Order();
        }
        return instance;
    }
}
