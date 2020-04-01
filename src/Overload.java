package src;

public class Overload {
    public void test(){
        System.out.println("无参数");
    }
    public void test(String msg){
        System.out.println("重载之后参数:" + msg);
    }

    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.test();
        ol.test("aaa");
    }

}
