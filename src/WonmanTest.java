package src;

class WonmanTest {
    public static void main(String[] args) {
        Wonman wm = new Wonman();
        wm.setName("李刚");
        System.out.println("成功设置name成员变量后，name的值：" + wm.getName());

        wm.setAge(1000);
        System.out.println("未设置age变量之前age的值："+ wm.getAge());

        wm.setAge(50);
        System.out.println("成功设置age变量之后age的值：" + wm.getAge());

    }
}
