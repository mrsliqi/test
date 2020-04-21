package project03;

public class PersonTest {
    public static void main(String[] args) {
        /*Person b = new Person();
        //b.setAge(40);
        System.out.println("年龄：" + b.getAge());*/
        Person a = new Person("Tom",1);
        System.out.println("name = " + a.getName() + ",age = " + a.getAge());

    }
}
