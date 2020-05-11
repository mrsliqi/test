package project05;

public class Person {
     String name;
     int age;
     int id = 1001;
     public Person(){
         System.out.println("我无处不在");
     }
     public Person(String name){
         this.name = name;
     }
     public Person(String name,int age){
         this(name);
         this.age = age;

     }
     public void eat(){
         System.out.println("吃饭");
     }
     public void walk(int distance){
         System.out.println("走路,走的距离是" + distance + "公里");
     }

}
