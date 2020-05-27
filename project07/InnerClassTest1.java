package project07;

public class InnerClassTest1 {
    //返回一个实现了Comparable接口类的对象
    public Comparable getComparable(){
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();
        return new Comparable(){

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

}
