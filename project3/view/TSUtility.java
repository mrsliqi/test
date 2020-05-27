package project3.view;

import java.util.Scanner;

public class TSUtility {
    private static Scanner scanner = new Scanner(System.in);

    /**读取键盘  1-4的选择
     *
     * @return
     */
    public static char readMenuSelection(){
        char c;
        for (; ; ) {
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("请输入正确的数字");
            } else break;
        }
        return c;
    }

    /**
     * 提示并等待，直到用户按回车键后返回
     */
    public static void readReturn(){
        System.out.print("按回车键继续");
        readKeyBoard(100,true);
    }

    /**
     * 从键盘中读取一个长度不超过两位的数，并将其作为方法的返回值
     * @return
     */
    public static int readInt(){
        int n;
        for (;;) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            }catch (NullPointerException e){
                System.out.println("数字输入错误，请重新输入");
            }
        }
        return n;
    }

    /**
     * 从键盘中读取‘Y’/‘N’，并将其作为返回值
     * @return
     */
    public static char readConfirmSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1,false).toUpperCase();
            try {
               c = str.charAt(0);
               break;
            }catch (ClassCastException e){
                System.out.print("选择错误，请再次选择");
            }
        }
        return c;
    }
    private static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            if(blankReturn){
                return line;
            }
            if (line.length() < 1 || line.length() > limit){
                System.out.println("请输入有效长度");
                continue;
            }
            break;
        }
        return line;
    }
}
