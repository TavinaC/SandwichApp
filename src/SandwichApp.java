import java.io.IOException;
import java.util.Scanner;

/**
 * Sandwich app demo. See README.md for more information.
 */
public class SandwichApp {
	
	/** @throws IOException */
	public static void main(String[] args) throws IOException {
		
		//Orders the first sandwich
		orderSandwich();
		
		System.out.print("Continue to order more sandwich? (y/n): ");
		continueOrder();
	}
	
	/**
	 * This method orders a single Sandwich.
	 * @throws IOException
	 */
    @SuppressWarnings("ConvertToTryWithResources")
	public static void orderSandwich() throws IOException {
		Scanner in = new Scanner(System.in);
		
		Order order = new Order();
		
		//Displays Bread
		Order.dispBread();
		//Validates and sets bread input
		order.setBread(validate(4, "\nSelect a bread [1, 4]: "));
		
		//Displays Vegetables 
		Order.dispVeg();
		//Validates and sets vegetable input. 
		//Continues to ask for input until 8 is inputed. 
		int veg = validate(8, "\nSelect vegetables: [1, 8]: ");
		while (veg !=8) {
			order.setVeg(veg);
			Order.dispVeg();
			veg = validate(8, "\nSelect vegetables: [1, 8]: ");
			if (veg != 8) {
				order.appendVeg();
			}
		}
		
		//Displays Meat
		Order.dispMeat();
		order.setMeat(validate(5, "\nSelect meat: [1, 5]: "));
		
		//Asks for customer name.
		System.out.print("Enter customer's name: ");
		String name = in.nextLine();
		order.setName(name);
		
		System.out.print(order);
		SandwichIO.writeOrderToFile(order);
		in.close();
	}
	
	/**
	 * This method validates integer is within range.
	 * @param max The max integer allowed.
	 * @param msg The message printed to ask the user for input.
	 * @return The validated integer value.
	 */
	public static int validate(int max, String msg) {
		//Checks the upper bound of a valid integer input.
		int value = validInt();
		while (value == -1 || value > max) {
			if (value > max) {
				System.out.print("Error! Number must be " + max + " or less.");
			}
			System.out.print(msg);
			value = validInt();
		}
		return value;
	}
	
	/**
	 * Validates the input as an integer.
	 * @return The validated input if it is a valid integer > 0.
	 */
    @SuppressWarnings("ConvertToTryWithResources")
	public static int validInt() {
		//Validates input and returns the value if it is an integer > 0.
		Scanner in = new Scanner(System.in);
		
		//Checks if input is an integer
		if (!in.hasNextInt()) {
			System.out.print("Error! Input must be an integer.");
			in.nextLine(); //Consumes the input 
			in.close();
			return -1;
		}
		
		//Checks if integer is > 0
		int input = in.nextInt(); 
		if (input < 1) {
			System.out.print("Error! Number must be greater than 0.");
			in.nextLine(); //Consumes input
			in.close();
			return -1;
		}
		in.close();
		return input; 
	}

	/**
	 * This method asks the user if they would like to continue ordering and validates that input. 
	 * Only "y" "Y" "n" and "N" are valid inputs.
	 * @throws IOException
	 */
    @SuppressWarnings("ConvertToTryWithResources")
	public static void continueOrder() throws IOException {
		 
		Scanner in = new Scanner(System.in);
		String input = "y";
		
		while (!input.equals("n")) {
			if (in.hasNext("y") || in.hasNext("Y")) {
				orderSandwich();
				System.out.print("Continue to order more sandwich? (y/n): ");
				
			} else if (in.hasNext("n") || in.hasNext("N")){
				System.out.println("Thank you for ordering.");
				
			} else {
				System.out.println("Invalid input. Please type y/n or Y/N.");
				System.out.print("Continue to order more sandwich? (y/n): ");
			}
			
			input = in.next().toLowerCase();
		}		
		in.close();
	}
}
