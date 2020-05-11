package project05.src;

public class Circle extends GeometricObject {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;
    public Circle(double radius,String coler,double weight){
        super(coler,weight);
        this.radius = radius;
    }
    public double findArea(){
        return 3.14 * radius * radius;
    }
}
