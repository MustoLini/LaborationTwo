# Laboration 2 // Johannes Danielsson

# What classes do I need:

## FileRead Class:
A folderFile.FileService class where it reads the txt file and and checks what category the object/food has, Then file reader should place it in that object category.

		ArrayList<folderProducts>FoodProductIn= new ArrayList<folderProducts>(); 
		int count=0;
		public void read(File file) throws IOException
		{
    		Scanner scanner = new Scanner(file);

    		while(scanner.hasNext())
		{
        	String[] food = scanner.nextLine().split(",");
		count++;
		}
		for(int i =0; i<food.lenght; i+3){
		FoodProductIn(food[i], food[i+1], food[i+2])
   	}
}
	

Also check if there is another line otherwise break.

## folderFile.FileWriter Class: 
A filewriter class where it should write products you want to add.
Something similiar to it asking you if you want to add product into the text file and then taking in info for example:

			AddProduct(){
			
			
		if(!FileRead.exist)
		folderFile.FileWriter writer= new file("NewFile.");
		bw = new BufferedWriter(writer);
		pw = new PrintWriter(bw);


			
		PcOutput= "How many products u want to add: "
			
		int count= UserInput=....;
			
		forloop(){
			
			
			
		PcOutput= "What is the name of product:"
			
		UserInput=....;
		
		pw.write(UserInput + ",")

		PcOutput= "What is product price:"

		UserInput=....;
		
		pw.write(UserInput + ",")

		PcOutput= "What kinda kategory is it:
			
			
		
		1. Fruit
		2. Dry-goods
		3. Meat
		4. Frezzerfood";
		Userinput=....;
		
		pw.write(UserInput + ",")
					
		}
			
	}
			
}



The Katogories that exist is fruit, dry-goods, meat, frezzerfood

## Food/folderProducts class:
Here it will add EAN-KOD(streckkod) to the products, be able to print out the price of the food and add it to the shopping list(Another class).
If it is removed food item from the array and add it to the shopping list.

Food Class Most have a constructer with 3 intakes that should be String with names of: NameOfProduct, String Price, String Kategory.
Food should have Getters and setters.

## Alternitve:
Food class holds the basic but like spliting upp the products by kategory and you make a Fruit class that extends from food class.

		
		


## Menu class:
Here it will give you options and interduce you to the shop. 

			The Options it will give you is:

		1. Print out the Food in stock ///(So all the food items and what kategories)

		System is prob going to look like this:
		{
			1.Milk, 23kr, Fridge.
			2.Meat, 200kr, Meat
			3.Salt, 20kr, dry-goods
			4.Floor, 30kr, dry-good 
			


		} 

		2. Print out the Food in seprete kategories. ///( So you pick what kategory food you want to pick and the you add it your list in Class Shoppning list)
		
		System is prob going to look like this:
		{
			What kategory do you want to pick:
			1. Fruit
			2. Dry-goods
			3. Meat
			4. Frezzerfood
			
			User input:

			Goes to that class and prints all the food i that Kategory.

			Pc/Computer: prints out: What do you want to add to your shopping list. 

			1.Milk, 23kr, Fridge.
			2.Yogurt , 20kr, Fridge.
			
			User Input: 

			Pc/Computer: prints out: Thank you for adding **** to your shopping list. 

		} 

		
