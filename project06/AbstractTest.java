package project06;

public class AbstractTest {
    public static void main(String[] args) {
//        Person1 p1 = new Person1();
//        p1.eat();
        new Student("tom",23);
    }
}
abstract class Creath{
    public abstract void breath();
}
abstract class Person1 extends Creath{
    String name;
    int age;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(){
        System.out.println("人走路");
    }
    public abstract void study();
}
class Student extends Person1{
    public Student(String name, int age) {
        super(name, age);
    }
    @Override
    public void study(){
        System.out.println("好好学习");
    }
    @Override
    public void breath(){
        System.out.println("呼吸新鲜空气");
    }
}
