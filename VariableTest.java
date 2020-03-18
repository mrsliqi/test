public class VariableTest {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1=12;
        float b2=b1+i1;
        System.out.println(b2);
        //强制类型转换
        double d1 = 12.3;
        int a = (int)d1;
        System.out.println(a);

        //没有精度损失
        long l1 = 123;
        short s2 = (short) l1;
        System.out.println(s2);
        //精度损失
        int b = 128;
        byte c = (byte) b;
        System.out.println(c);

    }
}
