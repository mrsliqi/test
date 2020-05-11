package project05.src;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c = new Circle(3.0,"white",2.0);
        MyRectangle m = new MyRectangle(2.0,3.0,"rad",1.0);
        test.displayGeometricObject(c);
        test.displayGeometricObject(m);
        boolean isEqual = test.equalsArea(c,m);
        System.out.println("面积是否相等: " + isEqual);
    }
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }
    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为：" + o.findArea());
    }
}
