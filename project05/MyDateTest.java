package project05;

import java.util.Objects;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14,5,2020);
        MyDate m2 = new MyDate(14,5,2020);
        System.out.println(m2.toString());
        System.out.println("******************************");
        if (m1 == m2){
            System.out.println("m1 = m2");
        }else {
            System.out.println("m1 != m2");
        }
        if (m1.equals(m2)){
            System.out.println("m1 is equal m2");
        }else {
            System.out.println("m1 is not equal m2");
        }
    }
}
class MyDate{
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int day;
    private int month;
    private int year;
    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day &&
                month == myDate.month &&
                year == myDate.year;
    }
    */
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof MyDate){
            MyDate m = (MyDate) obj;
            return this.day == m.day && this.month == m.month && this.year == m.year;
        }
        return false;
    }
    /*
    @Override
    public String toString() {
        return "MyDate [ dya " + day + ",month " + month + ",year " + year + " ]";
    }
    */

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
