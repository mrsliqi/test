package project06;

public class CricleTest {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        Cricle cricle1 = new Cricle();
        Cricle cricle2 = new Cricle(2);
        System.out.println(cricle.getId());
        System.out.println(cricle1.getId());
        System.out.println(cricle2.getId());
        System.out.println("创建的圆的个数为：" + Cricle.getTotal());

    }
}
class Cricle{
    private double radius;
    private int id;//每个圆的标号,自动被赋值
    private static int total;//创建的圆的个数
    private static int init = 1001;//被所有对象所共享

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

     public Cricle() {
        id = init;
        init++;
        total++;
    }

    public Cricle(double radius) {
        this();
        this.radius = radius;
    }
    public static int getTotal() {
        return total;
    }
    public double findArea(){
        return 3.14 * radius *radius;
    }

}
