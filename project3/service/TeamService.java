package project3.service;

import project3.domain.Architect;
import project3.domain.Desinger;
import project3.domain.Employee;
import project3.domain.Programmer;

/**
 * 开发团队成员管理、添加、删除
 */
public class TeamService {
    private static int counter = 1;//给memeberId赋值
    private final int MAX_MEMBER = 5;//开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];//记录当前团队中的各成员对象
    private int total = 0;//记录团队成员的实际人数

    /**
     * 获取开发团队中的成员
     * @return
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0;i < team.length;i++){
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 添加指定的成员到team中
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加
        if (total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发成员，无法添加
        if (!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发成员，无法添加");
        }
        //该员工已在开发团队中，无法添加
        if (isExist(e)){
            throw new TeamException("该员工已在开发团队中，无法添加");
        }
        //该成员已在其他开发团队中,无法添加
        Programmer p = (Programmer)e;
        if ("BUSY".equals(p.getStatus().getNAME())){
            throw new TeamException("该成员已在其他开发团队中,无法添加");
        }else
        //该成员正在休假，无法添加
        if ("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该成员正在休假，无法添加");
        }
        //至多有一名架构师
           //获取team中已有架构师、设计师、程序员人数
        int numOfArch = 0,numOfDes = 0,numOfPro = 0;
        for (int i = 0;i < total;i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Desinger) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }
            if (p instanceof Architect){
                if (numOfArch >= 1){
                    throw new TeamException("至多有一名架构师,无法添加");
                }
            }else if (p instanceof Desinger){
                if (numOfDes >= 2){
                    throw new TeamException("至多有两名设计师,无法添加");
                }
            }else if (p instanceof Programmer){
                if (numOfPro >= 3){
                    throw new TeamException("至多有三名程序员,无法添加");
                }
            }
            p.setStatus(Status.BUSY);
            p.setMemberId(counter++);
            //将e添加到现有team中
            team[total++] = p;
    }

    /**
     * 判断指定员工是否已经在团队中
     * @param e
     * @return
     */
    private boolean isExist(Employee e) {
        for ( int i = 0;i < total;i++){
            if (team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }


    /**
     * 删除team中指定成员
     * @param memberId
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (;i < total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total){
            throw new TeamException("未找到该成员");
        }
        for (int j = i;j < total;j++){
            team[j] = team[j + 1];
        }
        team[total - 1] = null;
        total --;
    }
}
