package be5_day10_OOP_abstract;

import java.util.ArrayList;

import pos.data.Restaurant;

public class Restaurant_Db {
	public final static ArrayList<Restaurant> RESTAURANTS_DB = new ArrayList<Restaurant>();

	public Restaurant_Db() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	public static void init() {
		
		RESTAURANTS_DB.add(new Restaurant("ARIA", "aria", "123"));
		RESTAURANTS_DB.add(new Restaurant("QUAY", "quay", "456"));
		
		
	}
	
}
