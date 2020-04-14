package project01;

public class Test {
    public static void main(String[] args) {
        boolean isFlag=true;
        String count = " ";
        int brance = 1000;
        while (isFlag){
            System.out.println("------------家庭收支记账软件-----------------");
            System.out.println("              1  收支明细");
            System.out.println("              2  登记收入");
            System.out.println("              3  登记支出");
            System.out.println("              4  退出");
            System.out.println("              请输入1-4：");

            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("------------当前收支明细记录----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说  明");
                    System.out.println(count);
                    System.out.println("---------------登记完成------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int Inmoney = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String Ininfo = Utility.readString();

                    brance = brance + Inmoney;
                    count = count + "收入" + "\t" + brance + "\t\t" + Inmoney + "\t\t\t" + Ininfo + "\n";
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int Outmoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String Outinfo = Utility.readString();

                    if (brance > Outmoney){
                        brance = brance - Outmoney;
                        count = count + "支出" + "\t" + brance + "\t\t" + Outmoney + "\t\t\t" + Outinfo + "\n";
                    }
                    break;
                case '4' :
                    System.out.println("确认是否退出(Y/N):");
                    char c = Utility.readConfirmSelection();
                    if ( c == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }

}
