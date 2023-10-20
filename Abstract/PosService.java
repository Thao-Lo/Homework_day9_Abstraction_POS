package be5_day10_OOP_abstract;

import java.util.ArrayList;
import java.util.Scanner;

import pos.data.Drink;
import pos.data.Food;
import pos.data.OrderItem;
import pos_concrete_aria.AriaPosService;
import pos_concrete_quay.QuayPosService;

public abstract class PosService {

	public abstract Food addNewFoodItem(Scanner keyboard);

	public abstract Drink addNewDrinkItem(Scanner keyboard);

	public abstract void showFoodMenu();

	public abstract void showDrinkMenu();

	public abstract void takeFoodOrder();

	public abstract void takeDrinkOrder();

	public abstract void printBill();

	public abstract void showDailyRevenue();

	public static PosService getPosServiceBaseOnRestrotName(String restaurantName) {

		switch (restaurantName) {
		case "ARIA":
			System.out.println("Welcome to Aria");
			return new AriaPosService();
		
		case "QUAY":
		System.out.println("QUAY RESTAURANT, Welcome! ");
		return new QuayPosService();
	}
		return null;
	}

}
