package src;

public class PerfectNumber {
    public static void main(String[] args) {

        for (int i = 1; i <=1000; i++){
            int factor = 0;
            for (int j = 1; j <= i/2; j++){
                if (i % j == 0){
                    factor = factor + 1;
                }
            }
            if(i == factor){
                System.out.println(i);
            }

        }
    }
}
