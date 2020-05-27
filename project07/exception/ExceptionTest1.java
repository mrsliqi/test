package project07.exception;

import org.junit.Test;

public class ExceptionTest1 {
    @Test
    public void test1(){
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("出现数值转换异常");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
