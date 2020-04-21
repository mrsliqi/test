package project01;

public class Bccount {
    private double balance;
    public Bccount(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    /**存钱
     *
     * @param amt
     */
    public void deposit(double amt){
        if (amt > 0){
            balance = balance + amt;
            System.out.println("存款成功，金额：" + amt );
        }else {
            System.out.println("存款失败");
        }
    }
    /**
     * 取钱
     */
    public void witndraw(double amt){
        if (balance  > amt){
            balance -= amt;
            System.out.println("取款成功，金额：" + amt );
        }else {
            System.out.println("取款失败");
        }
    }
}
