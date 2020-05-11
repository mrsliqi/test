package project05;

public class Student extends Person {
    String major;
    int id = 1002;
    public Student(){

    }
    public Student(String major){

        this.major = major;
    }
    public Student(String name,int age,String major){
        super(name,age);
        this.major = major;
    }
    public void study(){
        System.out.println("专业是" + major);
    }

    /**
     * 对父类中的eat方法进行重写
     */
    public void eat(){

        System.out.println("学生应该多吃有营的");
    }
    public void show(){
        System.out.println("name = " + name + ",age = " + super.age + ",id = " + super.id);
        System.out.println("id = " + this.id);
    }
}
