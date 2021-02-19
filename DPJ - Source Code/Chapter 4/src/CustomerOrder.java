// class and main class in same file

// class definition for Order
class Order {       // no need and cannot write 'public'
    private int orderNum;
    private double orderAmt;
    private double orderDisc;

    // constructor without argument
    public Order(){
    }

    // constructor with arguments
    public Order(int orderNumber, double orderAmount, double orderDiscount){
        orderNum = orderNumber;
        orderAmt = orderAmount;
        orderDisc = orderDiscount;
    }

    // class method
    public double finalOrderTotal( ){
        return (orderAmt-(orderAmt*orderDisc));
    }
}

// main class
public class CustomerOrder {
    public static void main(String [] args){
        int orderNum = 10;          // data initialization
        double orderAmt = 100;      // data initialization
        double orderDisc = 0.1;     // data initialization

        // declare and create an object with three arguments that have been created
        Order customerA = new Order(orderNum,orderAmt,orderDisc);
        double totalA = customerA.finalOrderTotal();
        System.out.println("Order no."+orderNum+" = RM "+String.format("%.2f",totalA));

        // declare and create an object with three arguments
        Order customerB = new Order(11,200,0.2);
        double totalB = customerB.finalOrderTotal();
        System.out.println("Order no."+(orderNum+1)+" = RM "+String.format("%.2f",totalB));
    }
}
