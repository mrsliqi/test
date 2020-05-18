package project06;

public class TemplateMethodTest {
    public static void main(String[] args) {
        BankTemplateMethod bankTemplateMethod = new ManageMony();
        bankTemplateMethod.process();
        System.out.println("*************************");
        BankTemplateMethod bankTemplateMethod1 = new DrawMoney();
        bankTemplateMethod1.process();
    }
}
abstract class BankTemplateMethod{
    //具体方法
    public void takeNumber(){
        System.out.println("取号排队");
    }
    //办理具体业务
    public abstract void transact();
    public void evaluate(){
        System.out.println("反馈评分");
    }
    //模板方法，把基本操作组合在一起，子类一般不能重写
    public final void process(){
        takeNumber();
        transact();
        evaluate();
    }
}
class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("取款");
    }
}
class ManageMony extends DrawMoney{
    public void transact(){
        System.out.println("理财");
    }
}
