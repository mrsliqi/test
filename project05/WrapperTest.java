package project05;

import org.junit.Test;

public class WrapperTest {
    //基本数据类型转换为对应包装类,调动包装类中的构造器

    @Test
    public void test1(){
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println(in2.toString());
        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
    }
    @Test
    //包装类转化成基本数据类型
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1);
        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2);
    }
    //基本数据类型 包装类-->String类型
    public void test3(){
        int num1 = 10;
        //方法一：连接运算
        String str1 = num1 + "";
        //方法二：
        float f1 = 12.3f;
        String.valueOf(f1);
    }
    //String类型基本数据类型 包装类
    public void test4(){
        String str = "123";
        int num2 = Integer.parseInt(str);
        
    }
}
