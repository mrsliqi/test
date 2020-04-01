package src;

public class VariableOverride {
    //成员变量
    /*private String name;//name是一个实例变量
    private static double price = 78.3; //price是一个类变量
    */
    private String price;
    private static String name = "aaa";
    public static void main(String[] args) {
        /*double price = 12.3;//方法里的局部变量
        System.out.println(price);
        System.out.println(VariableOverride.price);
        new VariableOverride().info();*/

        String name = "李刚";
        System.out.println(name);
        System.out.println(VariableOverride.name);
        new VariableOverride().info();
    }
    public void info(){
        /*String name = "李刚";
        System.out.println(name);
        System.out.println(this.name);*/

        String price = "aaa";
        System.out.println(price);
        System.out.println(this.price);
    }
}
