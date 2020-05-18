package project07;

public class SalariedEmployee extends Employee {

    private int monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthdy, int monthlySalary) {
        super(name, number, birthdy);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int earnings() {
        return monthlySalary;
    }
    public String toString(){
        return "SalariedEmployee[ " + super.toString() + "]";
    }
}
