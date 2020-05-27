package project07.exception;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {
    //********************************编译时异常

    //********************************运行时异常
    /**
     * ArithmeticException
     */
    @Test
    public void test5(){
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
    /**
     * InputMismatchException
     */
    @Test
    public void test4(){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);
    }
    /**
     * NumberFormatException
     */
    @Test
    public void test3(){
        String str = "123";
        str = null;
        int num = Integer.parseInt(str);
    }
    /**
     * ClassCastException
     */
    @Test
    public void test2(){
        Object obj = new Date();
        String str = (String)obj;
    }
    /**
     * NullPointerException
     */
    @Test
    public void test1(){
//        int[] arr = null;
//        System.out.println(arr[2]);
        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }
}
