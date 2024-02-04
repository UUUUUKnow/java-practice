package weeklyquiz02;

public class Grocery extends Product implements DeliveryChargeCalculator{
    Grocery(String name, int price, double weight){
        super(name, price, weight);
    }
    @Override
    public int getDeliveryCharge(double weight, int price){
        return deliveryFeeDiscount(weight, price);
    }
}
