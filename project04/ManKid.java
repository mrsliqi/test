package project04;

public class ManKid {
    private int sex;
    private int salary;
    public ManKid(){

    }
    public ManKid(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }
    public void manOrWoman(){
        if (sex == 1){
            System.out.println("man");
        }
        else if (sex == 0){
            System.out.println("woman");
        }
    }
    public void employeed(){
        String info = (salary == 0)? "no job" : "job";
        System.out.println(info);
    }
    public int getSex(){
       return sex;
    }
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }


}
