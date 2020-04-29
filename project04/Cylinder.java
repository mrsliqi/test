package project04;

public class Cylinder extends Circle{
    private double length;
    Circle c = new Circle();
    public Cylinder(){
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
       double volume = Math.PI * getRadius() * getRadius() * getLength();
        return volume;
    }

    /**
     * 返回圆柱的表面积
     * @return
     */
    public double findArea() {
        double v = Math.PI * getRadius() * getRadius() * 2 + Math.PI * 2 * getRadius() * getLength();
        return v;
    }
}