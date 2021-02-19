public class RetailItem {
    private String itemName;
    private double price;
    private int quantity;

    public RetailItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity; }

    public String getItemName( ){ return itemName; }

    public double getPrice( ){ return price; }

    public int getQuantity( ){ return quantity; }

    public double getTotalPrice( ){ return (quantity*price); }

    public double getDiscount( ){
        double discount = 0;
        if(quantity<10)
            discount = 0.00;
        else if(quantity>=10 && quantity<=19)
            discount = 0.20;
        else if(quantity>=20 && quantity<=49)
            discount = 0.30;
        else if(quantity>=50 && quantity<=99)
            discount = 0.40;
        else if(quantity>=100)
            discount = 0.50;
        return discount;
    }

    public double getTotalPayment( ){
        return getTotalPrice()-(getTotalPrice() * getDiscount());
    }
}
