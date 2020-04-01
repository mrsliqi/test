package src;
public class MultiPlication {
    public static void main(String[] args) {
        for (int a=1;a<=9;a++){
            for (int b=1;b<=a;b++){
                int c=a*b;
                System.out.print(b+ "*" + a + "=" + c + " ");
            }
            System.out.println();
        }
    }
}
