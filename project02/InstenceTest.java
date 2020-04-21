package project02;
public class InstenceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.sendEmail();
        p.playGame();
       /* //匿名
        new Phone().sendEmail();
        new Phone().playGame();
        */
       new Phone().price = 2000;
       new Phone().showPrice();

        System.out.println("**********************************");
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());//匿名对象使用
    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.playGame();;
        phone.sendEmail();
    }
}

class Phone{
    double price;
    public void sendEmail(){
        System.out.println("发送邮件");
    }
    public void playGame(){

    }
    public void showPrice(){
        System.out.println("手机价格为：" + price);
    }
}