package project3.service;

import project3.domain.*;

import static project3.service.Data.NOTEBOOK;

/**将Data中的数据封装在Employee[]数组中
 *
 */
public class NameListService {
    public static void main(String[] args) {

    }
    private Employee[] employees;

    /**
     * 给employees数组元素初始化
     */
    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0;i < Data.EMPLOYEES.length;i++){
            //获取员工的类型
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            //获取Employee的4个基本信息
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case Data.DESINGER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Desinger(id,name,age,salary,equipment,bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }
    private Equipment createEquipment(int index){
        int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);
        switch (type){
            case Data.PC:
                return new PC(Data.EQUIPMENTS[index][1],Data.EQUIPMENTS[index][2]);
            case NOTEBOOK:
                 return new NotBook(Data.EQUIPMENTS[index][1], Double.parseDouble(Data.EQUIPMENTS[index][2]));
            case Data.PRINTER:
                 return new Printer(Data.EQUIPMENTS[index][1],Data.EQUIPMENTS[index][2]);
        }
        return null;
    }

    /**
     * 获取当前所有的员工
     * @return
     */
    public Employee[] getAllEmployees(){
        return employees;
    }

    /**
     * 获取指定id的员工
     * @param id
     * @return
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0;i < Data.EMPLOYEES.length;i++){
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到该员工");
    }
}
