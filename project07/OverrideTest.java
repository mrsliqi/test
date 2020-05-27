package project07;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest overrideTest = new OverrideTest();
        overrideTest.display(new SubClass1());
    }
    public void display(SuperClass1 s){
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class SuperClass1{
    public void method() throws IOException{

    }
}
class SubClass1 extends SuperClass1{
    public void method() throws FileNotFoundException {

    }
}