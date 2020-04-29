package project04;

public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.sleep();
        System.out.println("*************************************");
        Student s1 = new Student();
        s1.eat();
        s1.name = "李四";
        System.out.println(s1.name);
        s1.breath();
        Creature c = new Creature();
    }
}
