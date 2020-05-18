package project06;

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);
        Person person = new Person();
        Person.info();
        System.out.println(person.age);
    }
}
class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //静态的代码块
    static {
        System.out.println("hello,static block");
        desc = "爱学习";
        info();
    }
    static {
        System.out.println("hello,static block2");
    }
    //非静态代码块
    {
        System.out.println("hello,block");
        age = 1;
        info();
        eat();
    }
    {
        System.out.println("hello,block2");
        age = 2;
    }
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("快乐的人");
    }
}
