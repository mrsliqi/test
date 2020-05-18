package project06;

public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager("库克",1000,123456,120000000);
       System.out.println("name = " + manager.getName() + ", age = " + manager.getAge() + ", salary = " + manager.getSalary() + ", bonus = " + ((Manager) manager).getBonus());
        manager.work();
        manager.toString();

    }
}
