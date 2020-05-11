package project05;
class Person1{
    protected String name = "person";
    protected int age = 50;
    public String getInfo(){
        return "name = " + name + ",age = " + age;
    }
}
class Student1 extends Person1{
    protected String school = "pku";
    public String getInfo(){
        return "name = " + name + ",age = " + age + ",school = " + school;
    }
}
class Graduate extends Student1{
    public String major = "IT";
    public String getInfo(){
        return "name = " + name + ",age = " + age + ",school = " + school + ",major = " + major;
    }
}
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Graduate());
    }
    public void method(Person1 e){
        //虚拟方法调用
        String info = e.getInfo();
        System.out.println(info);
        /*方法一：
        if (e instanceof Graduate){
            System.out.println("a graduated student");
            System.out.println("a student");
            System.out.println("a person");
        }else if (e instanceof Student1){
            System.out.println("a student");
            System.out.println("a person");
        }else {
            System.out.println("a person");
        }
        */
        //方法二：
        if (e instanceof Graduate){
            System.out.println("a graduated student");
        }
        if (e instanceof Student1){
            System.out.println("a student");
        }
        if (e instanceof Person1){
            System.out.println("a person");
        }
    }
}
