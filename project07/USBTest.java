package project07;

public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferDate(flash);
        //2.创建接口的非匿名实现类的匿名对象
        computer.transferDate(new Printer());
        //3.创建接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }
            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        computer.transferDate(phone);
        //4.创建接口的匿名实现类的匿名对象
        computer.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("ipad开始工作");
            }

            @Override
            public void stop() {
                System.out.println("ipad停止工作");
            }
        });
    }
}
class Computer{
    public void transferDate(USB usb){ //USB usb = new Flash();
        usb.start();
        System.out.println("传输数据的细节");
        usb.stop();
        System.out.println("传输数据的结束");
    }
}
interface USB{
    void start();
    void stop();
}
class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}