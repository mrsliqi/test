package project03;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "A";
        //a.age = 1;
        //a.legs = 4;
        a.show();
        a.setLegs(-6);
        a.show();
        a.setAge(6);
        a.show();
    }
}
class Animal{
    String name;
    private int age;
    private int legs;
    //对属性的设置
    public void setLegs(int l){
        if (l >= 0 && 1 % 2 ==0){
            legs = l;
        }else {
            legs = 0;
        }
    }
    //对属性的获取
    public int getLegs(){
        return legs;
    }

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void  eat(){
        System.out.println("动物进食");
    }
    public void show(){
        System.out.println("name = " + name + "，age = " + age + "，legs = " + legs);
    }
}
