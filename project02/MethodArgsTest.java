package project02;

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(21);
        test.show("Hello");
        test.show("AA","BB","23");
    }
    public void show(int i){

    }
    public void show(String s){
        System.out.println("show(String)");
    }
    public void show(String...strs){
        System.out.println("show(String...strs)");
        for (int i = 0;i < strs.length;i++){
            System.out.println(strs[i]);
        }
    }
}
