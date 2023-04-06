package important;

public class Product {
	static int price;
	static int discount;
	//int price;
	//int discount;

	public static void main(String[] w) {
		// TODO Auto-generated method stub
		price = 1000;
		discount = 10;
		
		price = price * discount/100;
	System.out.println("price of this product is: " + price);

	}

}
