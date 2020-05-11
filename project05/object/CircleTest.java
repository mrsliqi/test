package project05.object;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle("white",2.0,2.2);
        System.out.println("判断颜色是否相等：" + circle1.getColor().equals(circle2.getColor()));
        System.out.println("半径是否相等：" + circle1.equals(circle2));
        System.out.println("半径的大小：" + circle1.toString());
        System.out.println("半径的大小：" + circle2.toString());
    }


}
