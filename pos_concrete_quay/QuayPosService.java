package pos_concrete_quay;

import java.util.Scanner;

import be5_day10_OOP_abstract.PosService;
import pos.data.Drink;
import pos.data.Food;
import pos_concrete_aria.AriaPos_Db;

public class QuayPosService extends PosService{

	@Override
	public Food addNewFoodItem(Scanner keyboard) {
		System.out.print("New Quay Food Item: ");
		String name = keyboard.nextLine();

		System.out.print("New Quay Food Price: ");
		double price = keyboard.nextDouble();

		Food food = new Food(name, price);
		QuayPos_Db.FOODS_DB.add(food);

		return food;
	}

	@Override
	public Drink addNewDrinkItem(Scanner keyboard) {
		System.out.print("Add Quay Drink Item: ");
		String name = keyboard.nextLine();
		
		System.out.print("Add Quay Drink Price: ");
		double price = keyboard.nextDouble();

		keyboard.nextLine();
		Drink drink = new Drink(name);
		QuayPos_Db.DRINKS_DB.add(drink);
		
		return drink;
	}

	@Override
	public void showFoodMenu() {
		System.out.println("**Quay -  FOOD MENU: ");
		for (Food food : QuayPos_Db.FOODS_DB) {
			System.out.println("Food: " + food.name + " - Price $" + food.price);
		}
	}

	@Override
	public void showDrinkMenu() {
		System.out.println("**Quay -  DRINK MENU");
		for (Drink drink: QuayPos_Db.DRINKS_DB) {
			System.out.println("Drink: " + drink.name + " - Price $" + drink.price);
		}
	}

	@Override
	public void takeFoodOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeDrinkOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printBill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showDailyRevenue() {
		// TODO Auto-generated method stub
		
	}

}
