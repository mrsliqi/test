package project07.test;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle comparableCircle = new ComparableCircle(3.4);
        ComparableCircle comparableCircle1 = new ComparableCircle(5.2);
        int value = comparableCircle.compareTo(comparableCircle1);
        if (value > 0){
            System.out.println("comparableCircle的半径大");
        }else if (value < 0){
            System.out.println("comparableCircle1的半径大");
        }else {
            System.out.println("两个圆的半径一样大");
        }


    }
}
