package project05;

import java.util.Date;
import java.util.Objects;

public class ObjectTest {
    public static void main(String[] args) {
        Order1 o = new Order1();
        System.out.println(o.getClass().getSuperclass());
        Order1 o2 = new Order1("Tom",21);
        Order1 o3 = new Order1("Tom",21);
        System.out.println(o2.equals(o3));
        String str1 = new String("asd");
        String str2 = new String("asd");
        System.out.println(str1.equals(str2));
        Date date1 = new Date(21213);
        Date date2 = new Date(21213);
        System.out.println(date1.equals(date2));
    }
}
class Order1{
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Order1() {
    }

    public Order1(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    /**
     * 重写String里面的equals()方法
     * @param obj
     * @return
     */
    /*
    public boolean equals(Object obj){
       if (this == obj) {
           return true;
       }
       if (obj instanceof Order1){
           Order1 o1 = (Order1) obj;
           //比较每个属性
           if (this.age == o1.age && this.name.equals(o1.name)){
               return true;
           }
           else {
               return false;
           }
       }
        return false;
   }
   */
   //自动生成
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order1 order1 = (Order1) o;
        return age == order1.age &&
                Objects.equals(name, order1.name);
    }
}
