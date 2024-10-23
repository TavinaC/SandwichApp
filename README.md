Tavina Chen
May 6 2024
CS1400 
Project 2: Sandwich App

	This program provides input validation for all inputs.
	
	When the program starts, it first shows a list/menu of sandwich breads and their prices, then asks a user to
	select a bread by entering a corresponding integer number. A sample output is as follows:
	
	=== Select Sandwich Bread: ===
	1 White Bread $1.5
	2 Wheat Bread $1.6
	3 French Bread $1.8
	4 Organic Bread $2.0
	Select a bread [1, 4]:

	If the user enters an integer number not between 1 and 4, the user will see an error message and the input
	verification is done by using the programmer. A sample output for invalid number is as follows:
	
	If user enters 0:
	Error! Number must be greater than 0.
	
	After the user provides a right number for bread selection, the program asks the user to select vegetables. A
	sample output is as follows:
	
	=== Select Sandwich Vegetables: ===
	1 red onions $0.05
	2 olives $0.10
	3 pickles $0.10
	4 lettuce $0.20
	5 green peppers $0.25
	6 tomatoes $0.30
	7 cheese $0.50
	8 Quit vegetable selection
	Select vegetables: [1, 8]:
	
	After the user makes a choice for vegetable, such as 2 for olives. The program continues asking for selecting a
	vegetable so that the user can have multiple vegetables for one sandwich. The user can enter “8” to quit
	vegetable selection.
	
	After vegetable selection, the program shows meat selection. A sample output is as follows:
	
	=== Select Sandwich Meat: ===
	1 Ham $1.0
	2 Roasted Chicken Breast $1.1
	3 Turkey Breast $1.2
	4 Roast Beef $1.5
	5 Quit meat selection
	Select meat [1, 5]:
	
	Unlike vegetable selection which allows selecting multiple
	vegetables, meat selection does not repeat after the user enters a valid number between 1 and 5.
	
	After making a meat selection, the program asks for the user’s name so that the user can enter a name like
	John or John Smith.
	After entering a customer name, the program prints details for this order in computer monitor. The
	information includes the following six fields: date and time, customer name, bread, vegetable(s), meat, and a
	(formatted) total price, and each field is separated by a tab. A sample output to the monitor is as follows:
	
	Enter customer's name: John Smith
	Jul 6, 2016 10:35:43 AM John Smith Organic Bread lettuce, tomatoes, green peppers Roast Beef $4.25
	
	The same order content is written (appended) to a text file named orderline.txt.
	
	Continue to order more sandwich? (y/n):
	
	If the user enters y or Y in the above prompt, the whole order process repeats by asking the user to select a
	sandwich bread, vegetable(s), meat, and enter a customer name, and write the order content to file, etc