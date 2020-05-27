package project07;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.method2();
        subClass.method3();
        //接口中定义的静态方法只能通过接口来调用
        CompareA.method1();
    }
}
class SubClass extends SuperClass implements CompareA,CompareB{
    public  void method2(){
        System.out.println("CompareA,济南");
    }
    public void myMethod(){
        method3();
        super.method3();
        CompareA.super.method3();
    }
}
