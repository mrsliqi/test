package project02;
public class StudentTest {
    public static void main(String[] args) {
        //student类型的数组
        Student[] sd = new Student[20];
        for (int i = 0;i < sd.length;i++){
            //给数组元素赋值
            sd[i] = new Student();
            //给属性赋值
            sd[i].number = i + 1;
            //年纪1-6
            sd[i].state = (int)(Math.random() * (6 - 1 +1 ) + 1);
            //成绩
            sd[i].score = (int)(Math.random() * (100 - 0 + 1 ));
        }
        //遍历学生数组
        for (int i = 0 ; i < sd.length; i++){
            System.out.println(sd[i].info());
        }
        System.out.println("*******************************");
        //打印3年级的信息
        for (int i = 0;i < sd.length;i++){
            if ( sd[i].state == 3 ){
                System.out.println(sd[i].info());
            }
        }
        System.out.println("*******************************");
        //使用冒泡排序，遍历所有学生信息
        for (int i = 0;i < sd.length - 1;i++){
            for (int j = 0;j < sd.length - 1 -i;j++){
                if (sd[j].score > sd[j + 1].score){
                    //交换的是数组中的元素，不是成绩
                    Student temp = sd[j];
                    sd[j] = sd[j + 1];
                    sd[j + 1] = temp;
                }
            }
        }
        for (int i = 0;i < sd.length;i++){
            System.out.println(sd[i].info());
        }
    }
}
class Student{
    int number;//学号
    int state;//年纪
    int score;//成绩
    public String info(){
        return "学号" + number + "，年纪" + state + "，成绩" + score;
    }
}

