package weeklyquiz02;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{
    LargeAppliance(String name, int price, double weight) {
        super(name, price, weight);
    }
    @Override
    public int getDeliveryCharge(double weight, int price){
        return deliveryFeeDiscount(weight, price);
    }
}
