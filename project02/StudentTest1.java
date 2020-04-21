package project02;

public class StudentTest1 {
    public static void main(String[] args) {
        Student1[] sd = new Student1[20];
        for (int i = 0;i < sd.length;i++){
            sd[i] = new Student1();
            sd[i].number = i + 1;
            sd[i].state = (int)(Math.random() *  (6 - 1 +1 ) + 1);
            sd[i].score = (int) (Math.random() * (100 - 0 + 1 ) + 0);
        }
        StudentTest1 test = new StudentTest1();
        //遍历学生数组
        test.print(sd);
        System.out.println("************************************");
        //查找年级为3的学生
        test.searchState(sd,3);
        System.out.println("************************************");
        //排序
        test.sort(sd);
        test.print(sd);
    }

    /**遍历Student1 数组中的元素
     *
     * @param sd
     */
    public void print(Student1[] sd){
        for (int i = 0;i < sd.length;i++){
            System.out.println(sd[i].info());
        }
    }
    /**查找Student1数组中指定年级的学生的信息
     *
     * @param sd 指定数组
     * @param state 指定年级
     */
    public void searchState(Student1[] sd,int state){
        for (int i = 0;i < sd.length;i++){
            if (sd[i].state == state){
                System.out.println(sd[i].info());
            }
        }
    }

    /**将Stident1数组中成绩从小到大排列起来
     *
     * @param sd
     */
    public void sort(Student1[] sd){
        for (int i = 0;i < sd.length - 1;i++) {
            for (int j = 0; j < sd.length - 1 - i; j++) {
                if (sd[j].score > sd[j + 1].score) {
                    //交换的是数组中的元素，不是成绩
                    Student1 temp = sd[j];
                    sd[j] = sd[j + 1];
                    sd[j + 1] = temp;
                }
            }
        }
    }
}
class Student1{
    int number;
    int state;
    int score;
    public String info()   {
        return "学号" + number + ",班级" + state + ",成绩" + score;
    }
}
