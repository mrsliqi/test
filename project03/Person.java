package project03;

public class Person {
    /* private int age;
    public void setAge(int a){
        if (a < 0 || a > 100){
            System.out.println("非法值");
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
    */
   /*
    //属性
    String name;
    int age;

    //构造器
    public Person(){
        System.out.println("Person().....");
    }
   */
   private int age;
   private String name;


  /* public Person(){
       age = 18;
   }*/
  public Person(String n, int a) {
      name = n;
      age = a;
  }


    public void setAge(int a){
        if (a < 0 || a > 100){
            System.out.println("非法值");
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }

    public void setName(String n){
       name = n;
    }
    public String getName(){
       return name;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void study(){
        System.out.println("学习");
    }
}
