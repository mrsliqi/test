package project07;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Flyable flyable = new Plane();
        flyable.fly();
        flyable.stop();
        System.out.println("******************");
        Plane plane = new Plane();
        plane.fly();
        plane.stop();
    }
}
interface Flyable{
    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED = 100;
    public abstract void fly();
    void stop();
}
interface Attackable{
    void attack();
}
class Bullet extends Object implements Flyable,Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}
abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }
}