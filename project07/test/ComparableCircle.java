package project07.test;

public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
//            if (this.getRedius() > c.getRedius()){
//                return 1;
//            }else if (this.getRedius() < c.getRedius()){
//                return -1;
//            }else {
//                return 0;
//            }
            //radius声明为Double时
            return this.getRadius().compareTo(c.getRadius());
        }else {
            return 0;
        }
    }

}
