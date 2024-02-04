package weeklyquiz02;

public class Beauty extends Product implements DeliveryChargeCalculator{
    Beauty(String name, int price, double weight) {
        super(name, price, weight);
    }
    @Override
    public int getDeliveryCharge(double weight, int price){
        return deliveryFeeDiscount(weight, price);
    }
}
