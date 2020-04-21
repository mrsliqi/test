package project02;

public class Value4 {
    public static void main(String[] args) {
        String s1= "hello";
        Value4 test = new Value4();
        test.change(s1);
        System.out.println(s1);
    }
    public void change(String s){
        s = "hi--";
    }
}
