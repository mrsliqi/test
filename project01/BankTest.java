package project01;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Janne","Smith");
        bank.getCustomer(0).setBccount(new Bccount(2000));
        bank.getCustomer(0).getBccount().witndraw(500);
        double balance = bank.getCustomer(0).getBccount().getBalance();
        System.out.println("客户" + bank.getCustomer(0).getFristName() + "的账户余额：" + balance);
        bank.addCustomer("T","om");
        bank.getCustomer(1).setBccount(new Bccount(5000));
        bank.getCustomer(1).getBccount().deposit(500);
        System.out.println("用户的个数" + bank.getNumberOfCustomer());
    }
}
