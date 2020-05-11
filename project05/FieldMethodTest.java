package project05;
class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}
class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
public class FieldMethodTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count);
        sub.display();

        Base base = sub;
        System.out.println(base == sub);
        System.out.println(base.count);
        base.display();//虚拟方法调用
    }
}
