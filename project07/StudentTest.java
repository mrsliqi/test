package project07;

/**
 * 手动抛出异常
 *
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.regist(-1001);
            System.out.println(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
class Student{
    private int id;
    public void regist(int id) throws Exception {
        if (id > 0){
            this.id = id;
        }else {
//            System.out.println("输入的数据非法");
            //手动抛出异常
//            throw new  Exception("输入的数据非法");
            throw new MyException("输入数据不合理");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
