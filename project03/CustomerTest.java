package project03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Account acct = new Account(1000,2000,0.0123);
        cust.setAccount(acct);
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);
        System.out.println("Customer [" + cust.getFirstName() + ", " + cust.getLastName() + "] has account: id is "
                           + cust.getAccount().getId() + ", annualinterstRate is " + cust.getAccount().getAnnualinterstRate()*100
                           + "%, balance is " + acct.getBalance());
    }
}
