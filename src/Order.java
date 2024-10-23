//Tavina Chen
//May 6 2024
//CS1400 
//Project 2: Sandwich App: Order class

//This class simulates the order. This class has attributes of a customer name, a sandwich object,
//and the string value for time stamp. Time stamp is created the first time toString() is called.


import java.text.DateFormat;
import java.util.Date;

public class Order {
	private String name, timestamp = "";
	private final Sandwich sandwich = new Sandwich();
	
	public static void dispBread() {
		System.out.print("""
                                 === Select Sandwich Bread: ===
                                 1 White Bread $1.5
                                 2 Wheat Bread $1.6
                                 3 French Bread $1.8
                                 4 Organic Bread $2.0
                                 Select a bread [1, 4]: """);
	}
	
	public static void dispVeg() {
		System.out.print("""
                                 === Select Sandwich Vegetables: ===
                                 1 red onions $0.05
                                 2 olives $0.10
                                 3 pickles $0.10
                                 4 lettuce $0.20
                                 5 green peppers $0.25
                                 6 tomatoes $0.30
                                 7 cheese $0.50
                                 8 Quit vegetable selection
                                 Select vegetables: [1, 8]: """);
	}
	public static void dispMeat() {
		System.out.print("""
                                 === Select Sandwich Meat: ===
                                 1 Ham $1.0
                                 2 Roasted Chicken Breast $1.1
                                 3 Turkey Breast $1.2
                                 4 Roast Beef $1.5
                                 5 Quit meat selection
                                 Select meat [1, 5]: """);
	}
	
	public void setBread(int b) {
		sandwich.setBread(b);
	}
	
	public void setVeg(int v) {
		sandwich.setVeg(v);
	}
	
	public void appendVeg() {
		sandwich.appendVeg();
	}
	public void setMeat(int m) {
		sandwich.setMeat(m);
	}
	
	private void setDate() {
		Date now = new Date(); 
		DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM); 
		timestamp = defaultDate.format(now);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
    @Override
	public String toString() {
		if (timestamp.equals("")) {
			this.setDate();
		}
		
		//doesn't include price
		return timestamp + "\t" + name + "\t" + sandwich.getBread() + "\t" 
				+ sandwich.getVeg() + "\t" + sandwich.getMeat() + "\t$" + sandwich.getPrice() + "\n";
	}
}
