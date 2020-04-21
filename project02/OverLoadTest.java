package project02;
//同一个类，相同方法，参数列表不同，
//Arrays类中重载的sort()/binarySearch()
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.mOL(2);
        test.mOL(3,5);
        test.mOL("asd");
        System.out.println(test.max(8,5));
    }

    public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOL(int i,int j){
        System.out.println(i * j);
    }
    public void mOL(String s){
        System.out.println(s);
    }

    public int max(int i,int j){
        return (i > j)? i : j;
    }
    public double max(double a,double b){
        return (a > b)? a : b;
    }
    public double max(double a,double b,double c){
        double max = (a > b)? a : b;
        return (max > c)? max : c;
    }
}
