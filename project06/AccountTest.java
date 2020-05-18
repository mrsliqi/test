package project06;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Account account1 = new Account("123456",2000);
        Account.setInterestRate(0.012);
        Account.setMinMoney(100);
        System.out.println(account);
        System.out.println(account1);
        System.out.println(account1.getInterestRate());
        System.out.println(account1.getMinMoney());
    }
}
