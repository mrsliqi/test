package project07;

import java.util.Calendar;

public class PayrollSystem {
    public static void main(String[] args) {
        //方式一：
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入当月的月份：");
//        int month = scanner.nextInt();
        //方法二：
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;

        Employee[] arg = new Employee[2];
        arg[0] = new SalariedEmployee("李三",1000,new MyDate(2001,2,3),6000);
        arg[1] = new HourlyEmployee("小时工",1001,new MyDate(1994,5,1),200,63);
        for (int i = 0; i < arg.length;i++){
            System.out.println(arg[i]);
            System.out.println("月工资为：" + arg[i].earnings());

            if (month == arg[i].getBirthdy().getMonth()){
                System.out.println("生日快乐，奖励100元");
            }
        }
    }
}
