package src;

class PeRSon {
    public String name;
    public static int age;
}
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("PerSon的实例变量age的值：" + PeRSon.age);

        PeRSon p = new PeRSon();
        System.out.println("p变量的name的值：" + p.name + "，p变量的age的值：" + p.age);

        p.name = "李刚";
        p.age = 14;
        System.out.println("p变量的name的值：" + p.name + "，p变量的age的值：" + p.age);

        PeRSon p1 = new PeRSon();//通过实例修改了类变量，与通过该类修改类变量的值，效果是完全一样的，其他实例来访问这个类变量也将会获取这个被修改过之后的值
        System.out.println("p1对象的age的值：" + p1.age);
    }
}
