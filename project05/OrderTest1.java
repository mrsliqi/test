package project05;

import java.util.Objects;

public class OrderTest1 {
    public static void main(String[] args) {
        Order2 order1 = new Order2(22,"A");
        Order2 order2 = new Order2(22,"A");
        Order2 order3 = new Order2(22,"B");
        System.out.println(order1.equals(order2));
        System.out.println(order1.equals(order3));
    }
}
class Order2{
    private int orderId;
    private String orderName;
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order2() {
    }

    public Order2(int orderId, String orderName) {
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }
    /*自动生成
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order2)) return false;
        Order2 order2 = (Order2) o;
        return orderId == order2.orderId &&
                Objects.equals(orderName, order2.orderName);
    }
    */

    /**
     * 重写
     * @param obj
     * @return
     */
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Order2){
            Order2 o = (Order2) obj;
            return this.orderId == o.orderId && this.orderName.equals(o.orderName);
        }
        return false;
    }
}
