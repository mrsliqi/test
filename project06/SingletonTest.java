package project06;

public class SingletonTest {
    public static void main(String[] args) {
        Dank dank1 = Dank.instance;
        Dank.instance = null;
        Dank dank2 = Dank.instance;
        System.out.println(dank1 == dank2);
    }
}
class Dank{
    public Dank() {

    }
    public static  Dank instance = new Dank();
}