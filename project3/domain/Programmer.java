package project3.domain;

import project3.service.Status;

public class Programmer extends Employee {
    private int memberId;//记录加入开发团队后在团队中的ID
    private Status  status = Status.FREE;//员工状态
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetalis() + "\t程序员\t" + status + "\t\t\t\t\t\t" + equipment.getDescription();
    }
    public String getDetailsForTeam(){
        return memberId + "/" + getId() + "\t" +  getName() + "\t" + getAge() + "\t"+ getSalary() + "\t程序员";
    }
}
