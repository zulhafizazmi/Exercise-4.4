public class Main {

	public static void main(String[] args) {
		Fruits a = (Fruits) new Apple("Apple", 0.6);
		System.out.println(a);
		System.out.println();
		
		Fruits b = new RedApple("Red Apple", 0.5, "Red", "Sweet");
		System.out.println(b);
		System.out.println();
		
		Fruits c = new GreenApple("Green Apple", 0.7, "Green", "Sour");
		System.out.println(c);
		System.out.println();
		
		Fruits e = new Pineapple("Pineapple", 1.2, 0.5);
		System.out.println(e);
		System.out.println();
	}

}