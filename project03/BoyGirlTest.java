package project03;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",21);
        boy.shout();

        Girl girl = new Girl("朱丽叶",28);
        girl.marry(boy);

        Girl girl1 = new Girl("祝英台",32);
        int comper = girl1.comper(girl);

        if ( comper > 0){
            System.out.println(girl1.getName() + "da");
        }else if (comper < 0 ){
            System.out.println(girl.getName() + "大");
        }else {
            System.out.println("一样大");
        }
        }
}
