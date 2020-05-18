package project06;

public class FinalTest {
    final int WIDTH = 0;
    final int LEFT;
    final int RIGHT;

    {
        LEFT = 1;
    }
    public FinalTest(){
        RIGHT = 2;
    }
    public FinalTest(int n){
        RIGHT = n;
    }
    public void show(){
        final int NUM = 10;
    }
    public void show(final int num){
        System.out.println(num);
    }

    public static void main(String[] args) {
        FinalTest test = new FinalTest();
        test.show(10);
    }

}
final class FinalA{
}

