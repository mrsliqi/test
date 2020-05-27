package project3.view;

import project3.domain.Employee;
import project3.domain.Programmer;
import project3.service.NameListService;
import project3.service.TeamException;
import project3.service.TeamService;

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    /**
     * 用户界面的交互
     */
    public void enterMainMenu(){
        boolean isFlag = true;
        char menu = 0;
        while (isFlag){
            if ( menu != '1'){
                listAllEmployees();
            }
        System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择（1-4）：");
        menu = TSUtility.readMenuSelection();
            switch (menu){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)：");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
            }
        }
    }

    /**
     * 以表格形式列出公司所有的员工
     */
    private void listAllEmployees(){
        System.out.println("--------------------------开发团队调度员工------------------------------");
        Employee[] employees = listSvc.getAllEmployees();
        if (employees.length == 0){
            System.out.println("该公司没有员工");
        }else{
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t设备");
            for (int i = 0;i < employees.length;i++){
                System.out.println(employees[i]);
            }
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    /**
     * 显示团队成员列表操作
     */
    private void getTeam(){
        System.out.println("-----------------------------团队成员列表--------------------------------");
        Programmer[] team = teamSvc.getTeam();
        if (team == null || team.length == 0){
            System.out.println("该团队无开发成员");
        }else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t设备");
            for (int i = 0;i < team.length;i++){
                System.out.println(team[i].getDetailsForTeam());
            }
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    /**
     * 实现添加成员操作
     */
    private void addMember(){
        System.out.println("---------------添加成员------------------");
        System.out.println("请输入要添加的员工ID");
        int id = TSUtility.readInt();
        try {
            Employee emp = listSvc.getEmployee(id);
            teamSvc.addMember(emp);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因" + e.getMessage());
        }
        TSUtility.readReturn();

    }

    /**
     * 实现删除成员操作
     */
    private void deleteMember(){
        System.out.println("---------------删除成员------------------");
        System.out.println("输入要删除员工的TID:");
        int tid = TSUtility.readInt();
        System.out.println("确认是否删除(Y/N)");
        char delete = TSUtility.readConfirmSelection();
        if (delete == 'Y'){
            try {
                teamSvc.removeMember(tid);
                System.out.println("删除成功");
            } catch (TeamException e) {
                System.out.println("删除失败的原因" + e.getMessage());
            }
        }else return;
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
