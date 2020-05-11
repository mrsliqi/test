package project05;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        //实例化Scanner，用于读取学生成绩
        Scanner scanner = new Scanner(System.in);
        //创建Vector对象，相当于数组
        Vector v = new Vector();
        //通过循环给Vector添加数据
        int maxscore = 0;
        for (;;){
            System.out.println("请输入学生成绩(当输入负数时表示结束)：");
            int score = scanner.nextInt();
            //当输入负数是退出
            if (score < 0){
                return;
            }
            if (score > 100){
                System.out.println("请输入合法数据");
                break;
            }
            v.addElement(score);//自动装箱
            //获取学生成绩的最大值
            if (maxscore < score){
                maxscore = score;
            }
        }
        //遍历Vector，得到每个学生的成绩，与最大成绩比较，得到登记
        char level;
        for(int i = 0; i < v.size(); i++){
            Object obj = v.elementAt(i);
            //拆成基本数据类型
            int score = (int)obj;
            if (maxscore - score <= 10){
                level = 'A';
            }else if (maxscore - score <= 20){
                level = 'B';
            }else if (maxscore - score <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student " + i + "score is " + score + ",level is " + level);
        }

    }
}
