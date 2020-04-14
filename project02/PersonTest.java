package project02;

public class PersonTest {
    public static void main(String[] args) {
        //创建person类的对象
        Person p = new Person();
        //调用对象的结构
        //调用属性 "对象.属性"
        p.name = "tom";
        p.isMale = true;
        System.out.println(p.name);

        //调用方法  "对象.方法"
        p.eat();
        p.sleep();
        p.talk("Chinese");

        Person p1 = new Person();
        System.out.println(p1.name);

        Person p2 = p;//讲p的指针地址赋给了p2
        System.out.println(p2.name);
        p2.age = 10;
        System.out.println(p.age);
    }
}
class Person{
    //属性 = 成员变量 = field = 域、字段
    String name;
    int age;
    boolean isMale;

    //方法 = 成员方法 = 函数 = method
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话：" + language);
    }
}
