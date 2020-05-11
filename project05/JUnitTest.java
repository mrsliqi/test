package project05;

import org.junit.Test;

public class JUnitTest {
    int num = 10;

    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
        System.out.println(num);
    }
    public void show(){
        num = 20;
        System.out.println("..............");
    }
    class User{
        String name;
        int age;
        public boolean equals(Object object){
            if (this == object){
                return true;
            }
            if (!(object instanceof User)){
                return false;
            }
            User user = (User)object;
            return this.age == user.age && this.name.equals(user.name);
        }
    }
}
