package project06;

class Root{
    static {
        System.out.println("Root的静态初始化");
    }
    {
        System.out.println("Root的普通初始化");
    }
    public Root(){
        super();
        System.out.println("Root的无参数的构造器");
    }
}
class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化");
    }
    {
        System.out.println("Mid的普通初始化");
    }
    public Mid(){
        super();
        System.out.println("Mid的无参数的构造器");
    }
    public Mid(String msg){
        super();
        System.out.println("Mid的有参数的构造器" + msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化");
    }
    {
        System.out.println("Leaf的普通初始化");
    }
    public Leaf(){
        super("Java");
        System.out.println("Leaf的构造器");
    }
}
public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
        System.out.println("*******");
        new Leaf();
    }
}

