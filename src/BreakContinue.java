package src;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if (i % 4 == 0){
                //break;//跳出整个循环结构,
                continue;//跳出当次循环,关键字后面不能跟执行语句
            }
            System.out.println(i);
        }
        //***************************************
        label:for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    break label;//跳出整个循环结构, 结束包裹关键字的最近一层
                    //continue label;//跳出当次循环,关键字后面不能跟执行语句
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //***********************************

    }
}
