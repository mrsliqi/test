package project07;

public class InnerClassTest {
    public static void main(String[] args) {
        Person.Sleep sleep = new Person.Sleep();
        Person person = new Person();
        Person.Dog dog = person.new Dog();
        sleep.sing();
        dog.show();
        dog.display("金毛");
    }
}
class Person{
    String name = "张三";
    int age;
    public void eat(){
        System.out.println("吃饭");
    }

    //非静态成员内部类
    class Dog{
        String name = "泰迪";
        int age;
        public void show(){
            System.out.println("是条狗");
            eat();
        }
        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
        }
    }
    //静态成员内部类
   static class Sleep{
        String name;
        public void sing(){
            System.out.println("睡觉");

        }
    }
    //方法内内部类
    public void method(){
        class AA{

        }
    }
    //代码块内内部类
    {
        class BB{

        }
    }
    //构造器内内部类
    public Person() {
        class CC{

        }
    }
}