package project04;

public class CircleTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(1.0);
        cy.setLength(2.0);
        System.out.println("圆柱的体积" + cy.findVolume());
        Circle c = new Circle();
        System.out.println("底面的面积" + c.findArea());
        System.out.println("圆柱的表面积"+ cy.findArea());
    }
}
