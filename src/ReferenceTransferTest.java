package src;
//参数传递，传递的是地址，位置，并不是所指向的值

class Person{
    int a;
    int b;
}

public class ReferenceTransferTest {
    public static void spay(Person p){
        int temp = p.a;
        p.a = p.b;
        p.b = temp;
        System.out.println("spay中a的值：" + p.a + "，b的值：" + p.b);
        p = null;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.a = 6;
        p.b = 9;
        spay(p);
        System.out.println("交换后a的值：" + p.a + "，b的值：" + p.b);
    }
}
