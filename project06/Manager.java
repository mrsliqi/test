package project06;

public class Manager extends Employee{
    private double bonus;//奖金

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提高运行效率");
    }

}
