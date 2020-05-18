package project07;

public class HourlyEmployee extends Employee {
    private int wage;//每月的工资
    private int  hour;//月工作小时数

    public HourlyEmployee(String name, int number, MyDate birthdy, int wage, int hour) {
        super(name, number, birthdy);
        this.wage = wage;
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int earnings() {
        return wage * hour;
    }
    public String toString(){
        return "HourlyEmployee[" + super.toString() + "]";
    }
}
