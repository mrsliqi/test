package project06;

public class Something {
    public static void main(String[] args) {
       Other o = new Other();
       new Something().addone(o);
    }
    public void addone(final Other o){
        o.i++;
    }
}
class Other{
    public int i;
}
