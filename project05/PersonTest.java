package project05;

public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student("计算机");
        s.study();
        s.eat();
        s.walk(9);
        Person p = new Person();
        p.eat();
    }
}
