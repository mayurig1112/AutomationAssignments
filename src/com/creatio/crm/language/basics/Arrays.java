package com.creatio.crm.language.basics;

public class Arrays {

	public static void main(String[] args) {
		String[] categories= new String[] {"Groceries","Electronics"};
		System.out.println("Two Categories :"+categories[0]+","+categories[1]);
		//A supermarket offers products in two main categories: "Groceries" and "Electronics."
		
		String [] [] subCategories= new String [2] [4];
				subCategories[0][0]="Beverages";
				subCategories[0][1]="Snacks";
				subCategories[0][2]="Dairy Products";
				subCategories[0][3]="Produce";
				subCategories[1][0]="Beverages";
				subCategories[1][1]="Snacks";
				subCategories[1][2]="Dairy Products";
				subCategories[1][3]="Produce";
				
		System.out.println("Subcategories of Groceries:" +subCategories[0][0]+","+subCategories[0][1]+","+subCategories[0][2]+","+subCategories[0][3]);
		System.out.println("Subcategories of Electronics:" +subCategories[1][0]+","+subCategories[1][1]+","+subCategories[1][2]+","+subCategories[1][3]);
		// Each category is further divided  into four subcategories
		//2D array
		
		String[][][] products=new String[2][4][5];
		products[0][0][0]="Cola";
		products[0][0][1]="Orange Juice";
		products[0][0][2]="Lemonade";
		products[0][0][3]="Green Tea";
		products[0][0][4]="Black Coffee";
		 //Groceries: Bevarages
		
		products[0][1][0]="Popcorn";
		products[0][1][1]="Trail Mix";
		products[0][1][2]="Beef Jerky";
		products[0][1][3]="Salted Nuts";
		products[0][1][4]="Rice Cakes";
		//Groceries:Snacks
		
		products[0][2][0]="Cottage Cheese";
		products[0][2][1]="Heavy Cream";
		products[0][2][2]="Ice Cream";
		products[0][2][3]="Parmesan Cheese";
		products[0][2][4]="Eggnog";
		//Groceries:Dairy Products
		
		products[0][3][0]="Apples";
		products[0][3][1]="Bananas";
		products[0][3][2]="Carrots";
		products[0][3][3]="Potatoes";
		products[0][3][4]="Onions";
		//Groceries:Produce
		
		products[1][0][0]="Cola";
		products[1][0][1]="Orange Juice";
		products[1][0][2]="Lemonade";
		products[1][0][3]="Green Tea";
		products[1][0][4]="Black Coffee";
		 //Electronics: Bevarages
		
		products[1][1][0]="Popcorn";
		products[1][1][1]="Trail Mix";
		products[1][1][2]="Beef Jerky";
		products[1][1][3]="Salted Nuts";
		products[1][1][4]="Rice Cakes";
		//Electronics:Snacks
		
		products[1][2][0]="Cottage Cheese";
		products[1][2][1]="Heavy Cream";
		products[1][2][2]="Ice Cream";
		products[1][2][3]="Parmesan Cheese";
		products[1][2][4]="Eggnog";
		//Electronics:Dairy Products
		
		products[1][3][0]="Apples";
		products[1][3][1]="Bananas";
		products[1][3][2]="Carrots";
		products[1][3][3]="Potatoes";
		products[1][3][4]="Onions";
		//Electronics:Produce
		
		
		System.out.println("Products of Groceries: Bevarages: " + products[0][0][0] +","+  products[0][0][1] +"," + products[0][0][2]+ "," +products[0][0][3] + "," +products[0][0][4]);
		System.out.println("Products of Groceries: Snacks: " + products[0][1][0] +","+  products[0][1][1] +"," + products[0][1][2]+ "," +products[0][1][3] + "," +products[0][1][4]);
		System.out.println("Products of Groceries: Dairy Products: " + products[0][2][0] +","+  products[0][2][1] +"," + products[0][2][2]+ "," +products[0][2][3] + "," +products[0][2][4]);
		System.out.println("Products of Groceries: Produce: " + products[0][3][0] +","+  products[0][3][1] +"," + products[0][3][2]+ "," +products[0][3][3] + "," +products[0][3][4]);
		System.out.println("Products of Electronics: Bevarages: " + products[1][0][0] +","+  products[1][0][1] +"," + products[1][0][2]+ "," +products[1][0][3] + "," +products[1][0][4]);
		System.out.println("Products of Electronics: Snacks: " + products[1][1][0] +","+  products[1][1][1] +"," + products[1][1][2]+ "," +products[1][1][3] + "," +products[1][1][4]);
		System.out.println("Products of Electronics: Dairy Products: " + products[1][2][0] +","+  products[1][2][1] +"," + products[1][2][2]+ "," +products[1][2][3] + "," +products[1][2][4]);
		System.out.println("Products of Electronics: Produce: " + products[1][3][0] +","+  products[1][3][1] +"," + products[1][3][2]+ "," +products[1][3][3] + "," +products[1][3][4]);
 
		
	}
}