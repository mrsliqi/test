package project02;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();

    }
}
class User{
    //定义属性
    String name;
    int age;
    boolean isMale;

    public void talk(String language){ //language形参，局部变量
        System.out.println("我们使用" + language + "语言");
    }
    public void eat(){
        String food = "面条"; //局部变量
        System.out.println("北方人喜欢吃" + food);
    }
}
