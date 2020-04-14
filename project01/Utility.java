package project01;
import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    //账本信息
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("请输入正确的数字");
            } else break;
        }
        return c;
    }

    //描述收入金额
    public static int readNumber(){
        int n;
        for (;;){
            String str = readKeyBoard(4);
          try{
              n = Integer.parseInt(str);
              break;
          }catch(NumberFormatException e){
              System.out.println("请输入正确信息");
          }
        }
        return n;
    }
    //描述收入说明
    public static String readString(){
        String str = readKeyBoard(10);
        return str;
    }
    //描述支出金额
    //确认选择的退出
    public static char readConfirmSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y'|| c == 'N'){
                break;
            }else {
                System.out.println("请输入正确的数值：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit){
        String line = "";
        while (scanner.hasNext()){
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit){
                System.out.println("请输入有效长度");
                continue;
            }
            break;
        }
        return line;
    }



}
