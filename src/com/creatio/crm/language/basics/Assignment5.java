package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		
		//1. Create a list of the top 5 most populated countries in the world and print 2nd Country 
		
		List<String>populatedCountries=new ArrayList<String>();
		//list of the top 5 most populated countries in the world
		
	populatedCountries.add("India");
	populatedCountries.add("USA");
	populatedCountries.add("Canada");
	populatedCountries.add("UK");
	populatedCountries.add("Japan");
	
	System.out.println("list of the top 5 most populated countries in the world : "+populatedCountries);
	
	System.out.println("Second Country in the list : "+populatedCountries.get(1));
	
	System.out.println("===============================================================");
	
	
	//2.Create a set of the top 10 most visited tourist attractions in the world and print out its  size. 
	
	Set<String>touristAttractions = new LinkedHashSet<String>();
	//Set to store top 10 most visited tourist attractions
	
	touristAttractions.add("Eiffel Tower");
	touristAttractions.add("Colosseum");
	touristAttractions.add("Taj Mahal");
	touristAttractions.add("New York");
	touristAttractions.add("Great Wall of China");
	touristAttractions.add("Louvre Museum");
	touristAttractions.add("Angkor Wat");
	touristAttractions.add("Statue of Liberty");
	touristAttractions.add("Rome");
	touristAttractions.add("UK");
	
	System.out.println("set of the top 10 most visited tourist attractions in the world : "+touristAttractions);
	
	System.out.println("Size of the set : "+touristAttractions.size());
	
	System.out.println("===============================================================");
	
	//3. Create a map of the 5 largest cities in the United States and their populations
	
	Map<String, String>population=new LinkedHashMap<String, String>();
	
	//Map to store 5 largest cities in the United States and their populations
	
	population.put("New York", "8,258,035");
	population.put("Los Angeles", "3,820,914");
	population.put("Chicago", "2,664,452");
	population.put("Houston", "2,314,157");
	population.put("Phoenix","1,650,070");
	
	System.out.println("map of the 5 largest cities in the United States and their populations : "+population);
	
	System.out.println("===============================================================");
	
	//4.Create an array of 10 random integers and print out the sum of 3rd and 5th Value
	
	int[] randomNumbers=new int[10];
	//array 
	
	randomNumbers[0]=1;
	randomNumbers[1]=2;
	randomNumbers[2]=3;
	randomNumbers[3]=4;
	randomNumbers[4]=5;
	randomNumbers[5]=6;
	randomNumbers[6]=7;
	randomNumbers[7]=8;
	randomNumbers[8]=9;
	randomNumbers[9]=10;
	
	System.out.println(randomNumbers[0] + ","+randomNumbers[2]+","+randomNumbers[4] + ","+randomNumbers[6]+","+randomNumbers[8] + ","+randomNumbers[1]+","+randomNumbers[3] + ","+randomNumbers[5]+","+randomNumbers[7] + ","+randomNumbers[9]);
	
	System.out.println("===============================================================");
	
	//5.Create a list of the top 5 highest-grossing movies of all time and print out the third movie  on the list.
	
	List<String>moviesHighest=new LinkedList<String>();
	//list of the top 5 highest-grossing movies
	
	moviesHighest.add("Baaubali");
	moviesHighest.add("RRR");
	moviesHighest.add("Pushpa");
	moviesHighest.add("kantara");
	moviesHighest.add("Dangal");
	
	System.out.println("third movie  on the list : "+moviesHighest.get(2));
    
	
	

	}

}
