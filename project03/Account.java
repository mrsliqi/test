package project03;

public class Account {
    private int id;
    private double balance;
    private double annualinterstRate;
    public Account(int id,double balance,double annualinterstRate){
        this.id = id;
        this.balance = balance;
        this.annualinterstRate = annualinterstRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualinterstRate(double annualinterstRate) {
        this.annualinterstRate = annualinterstRate;
    }

    public double getAnnualinterstRate() {
        return annualinterstRate;
    }

    /**取钱
     * 首先判断能不能满足取钱条件
     * @param amount
     */
    public void withdraw(double amount){
        if (balance >= amount){
            balance = balance - amount;
            System.out.println("成功取出" + amount);
           // System.out.println(balance);
        }else {
            System.out.println("余额不足，取款失败");
        }
    }

    /**存钱
     *
     * @param amount
     */
    public void deposit(double amount){
        if (amount > 0){
            balance = this.balance + amount;
            System.out.println("成功存入" + amount);
            //System.out.println(balance);
        }else {
            System.out.println("存钱失败");
        }
    }
}
