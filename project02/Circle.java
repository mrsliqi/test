package project02;

public class Circle {
    double radius;
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
class PassObject{
    public void printAreas(Circle c,int time){
        System.out.println("Radius\t\tArea");
        for (int i = 1;i <= time;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea());
        }
    }

    public static void main(String[] args) {
        PassObject po = new PassObject();
        po.printAreas(new Circle(),5);
    }
}