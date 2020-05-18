package project07;
public abstract class Employee {
    private String name;
    private int number;
    private  MyDate birthdy;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthdy) {
        this.name = name;
        this.number = number;
        this.birthdy = birthdy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthdy() {
        return birthdy;
    }

    public void setBirthdy(MyDate birthdy) {
        this.birthdy = birthdy;
    }

    public abstract int earnings();

    @Override
    public String toString() {
        return  "name='" + name  +
                ", number=" + number +
                ", birthdy=" + birthdy.toDateString() ;
    }
}
