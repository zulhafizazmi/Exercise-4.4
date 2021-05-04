public class Pineapple extends Fruits {							
	private int number;											
	private double discountrate, price, weight, totalprice;
	Pineapple(String name, double price, double weight){			
		super(name);											
		this.price = price;
		this.weight = weight;
		System.out.println("The price per kg of pineapple is RM" + this.price);
		System.out.println("The weight of each pineapple is = " + this.weight + "kg");
		System.out.print("The number of pineapple you want to buy is :");
		this.number = scan.nextInt();
		System.out.println("The total weight of pineapple you bought is " + this.number*this.weight + "kg");
		determinePriceFormula();
	}
	
	public void determinePriceFormula() {						
		if (this.number*this.weight < 10 ) {
			totalprice = CalculatePrice();
		}
		else if (this.number*this.weight > 10  && this.number*this.weight < 100) {
			discountrate = 0.85;
			System.out.println("Since you buy more than 10kg and less than 100kg of pineapple, you have 15% discount");
			totalprice = CalculatePrice(discountrate);
		}
		else {
			discountrate = 0.80;
			weight = 100;
			System.out.println("Since you buy pineapple of 100kg or more, you have 20% discount and the price is always calculated using 100kg of pineapple");
			totalprice = CalculatePrice(discountrate, weight);
		}
	}
	
	public double CalculatePrice() {											
		return this.number * this.weight * this.price;
	}
	
	public double CalculatePrice(double discountrate) {							
		return this.number * this.weight * this.price * discountrate;
	}
	
	public double CalculatePrice(double discountrate, double weight) {			
		return weight * this.price * discountrate;
	}
	
	public String toString() {
		return ("Total Price = RM" + totalprice);
	}
}
