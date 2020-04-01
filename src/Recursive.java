package src;

public class Recursive {
    public static int fn(int n){
        if (n == 20){
            return 1;
        }else if(n == 21){
            return 4;
        }else {
            //return 2 * fn(n - 1) + fn(n - 2); //fn(10)=2*fn(9)+fn(8)
            return fn(n + 2) - 2 * fn(n + 1);//大的一端已知，20,21  fn(19)=fn(21)-2*fn(20)
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
    }
}
