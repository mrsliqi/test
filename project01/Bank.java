package project01;

public class Bank {
    private Customer[] customer;//可存放多个客户的数组
    private int numberOfCustomer;//记录客户的个数

    /**
     * 初始化数组
     */
    public Bank(){
        customer = new Customer[10];
    }

    /**
     * 添加客户
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f, l);
        customer[numberOfCustomer] = cust;
        numberOfCustomer ++;
    }

    /**
     * 获取客户的个数
     * @return
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 获取指定位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if (index >= 0 && index < numberOfCustomer){
            return customer[index];
        }
        return null;
    }
}
