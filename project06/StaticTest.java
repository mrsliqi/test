package project06;

public class StaticTest {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        chinese.name = "张三";
        chinese.age = 41;
        chinese.nation = "中国";
        System.out.println("name" + chinese.name + ",age" + chinese.age);
        System.out.println(chinese.nation );
        Chinese chinese1 = new Chinese();
        chinese1.name = "李四";
        chinese1.age = 30;
        chinese1.nation = "英国";
        System.out.println("name" + chinese1.name + ",age" + chinese1.age);
        System.out.println(chinese1.nation);
        System.out.println(Chinese.nation);

    }
}
class Chinese{
    String name;
    int age;
    static String nation;
}

