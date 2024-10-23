/**
 * This class simulates the sandwich entity in real world. It has attributes of bread, vegetables,
 * meat, and price of the sandwich, and corresponding methods.
 */
public class Sandwich {
	private String bread = "", vegetables = "", meat = "";
	private double price = 0;
	
	/**
	 * Sets the bread type for the sandwich.
	 * @param b The corresponding number to the type of bread on the menu.
	 */
	public void setBread(int b) {
		switch (b) {
		case 1:
			bread = "White Bread";
			price += 1.5;
			break;
		case 2: 
			bread = "Wheat Bread";
			price += 1.6;
			break;
		case 3:
			bread = "French Bread";
			price += 1.8;
			break;
		case 4:
			bread = "Organic Bread";
			price += 2;
			break;
		}
	}
	
	/**
	 * Sets the vegetables for the sandwich.
	 * @param v The corresponding number to the type of vegetables on the menu.
	 */
	public void setVeg(int v) {
		switch (v) {
		case 1:
			vegetables += "red onions";
			price += 0.05;
			break;
		case 2: 
			vegetables += "olives";
			price += 0.1;
			break;
		case 3:
			vegetables += "pickles";
			price += 0.1;
			break;
		case 4:
			vegetables += "lettuce";
			price += 0.2;
			break;
		case 5:
			vegetables += "green peppers";
			price += 0.25;
			break;
		case 6: 
			vegetables += "tomatoes";
			price += 0.3;
			break;
		case 7:
			vegetables += "cheese";
			price += 0.5;
			break;
		}
	}
	
	/**
	 * Allows for a comma to be inserted between vegetable selections
	 * if more than 1 is chosen.
	 */
	public void appendVeg() {
		vegetables += ", ";
	}
	
	/**
	 * Sets the meat type for the sandwich.
	 * @param m The corresponding number to the type of meat on the menu.
	 */
	public void setMeat(int m) {
		switch (m) {
		case 1:
			meat = "Ham";
			price += 1;
			break;
		case 2: 
			meat = "Roasted Chicken Breast";
			price += 1.1;
			break;
		case 3:
			meat = "Turkey Breast";
			price += 1.2;
			break;
		case 4:
			meat = "Roast Beef";
			price += 1.5;
			break;
		}
	}
	
	/**
	 * @return The bread type.
	 */
	public String getBread() {
		return bread;
	}
	
	/**
	 * @return The vegetables. If no vegetables were chosen, returns "no vegetables".
	 */
	public String getVeg() {
		if (vegetables.equals("")) {
			return "no vegetables";
		} else {
			return vegetables;
		}
	}
	
	/**
	 * @return The meat in the sandwich.
	 */
	public String getMeat() {
		if (meat.equals("")) {
			return "no meat";
		} else {
			return meat;
		}
	}
	
	/**
	 * @return The total price of the sandwich.
	 */
	public String getPrice() {
		return String.format("%.2f", price);
	}
}
