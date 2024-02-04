package weeklyquiz02;

public class Product {
    String name;
    int price;
    double weight;

    Product(String name, int price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    int deliveryFee(double weight) {
        if (weight < 3) {
            return 1000;
        } else if (weight < 10) {
            return 5000;
        } else return 10000;
    }

    int deliveryFeeDiscount(double weight, int price) {
        if (price < 30000) {
            return deliveryFee(weight);
        } else if (price < 100000) {
            return deliveryFee(weight) - 1000;
        } else return 0;

    }

    public static void main(String[] args) {
        System.out.println("쇼핑몰에서 판매하는 상품종류는 아래와 같습니다.");

        System.out.println("1. 식료품");
        Grocery grocery = new Grocery("포카리스웨트 500ml x 20",32500, 10);
        System.out.println("상품명: "+ grocery.name + " / 가격: " + grocery.price + "원" +" / 무게: " + grocery.weight + "kg");
        System.out.println("해당 상품의 배송비는 " + grocery.deliveryFeeDiscount(grocery.weight, grocery.price) + "원입니다.");

        System.out.println("2. 화장품");
        Beauty beauty = new Beauty("닥터지 레드 블레미쉬 모이스처 클렌징폼", 10000, 0.3);
        System.out.println("상품명: "+ beauty.name + " / 가격: " + beauty.price + "원" +" / 무게: " + beauty.weight + "kg");
        System.out.println("해당 상품의 배송비는 " + beauty.deliveryFeeDiscount(beauty.weight, beauty.price) + "원입니다.");

        System.out.println("3. 대형가전");
        LargeAppliance largeAppliance = new LargeAppliance("LG스타일러", 1420000, 105);
        System.out.println("상품명: "+ largeAppliance.name + " / 가격: " + largeAppliance.price + "원" +" / 무게: " + largeAppliance.weight + "kg");
        System.out.println("해당 상품의 배송비는 " + largeAppliance.deliveryFeeDiscount(largeAppliance.weight, largeAppliance.price) + "원입니다.");
    }
}
