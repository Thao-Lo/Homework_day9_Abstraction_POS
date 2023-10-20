package pos_concrete_aria;

import java.util.Scanner;

import be5_day10_OOP_abstract.PosService;
import pos.data.Drink;
import pos.data.Food;

public class AriaPosService extends PosService {

	@Override
	public Food addNewFoodItem(Scanner keyboard) {

		System.out.print("New Aria Food Item: ");
		String name = keyboard.nextLine();

		System.out.print("New Aria Food Price: ");
		double price = keyboard.nextDouble();

		Food food = new Food(name, price);
		AriaPos_Db.FOODS_DB.add(food);

		return food;
	}

	@Override
	public Drink addNewDrinkItem(Scanner keyboard) {
		System.out.print("New Aria Drink Item: ");
		String name = keyboard.nextLine();
		
		System.out.print("New Aria Drink Price: ");
		double price = keyboard.nextDouble();

		keyboard.nextLine();
		Drink drink = new Drink(name);
		AriaPos_Db.DRINKS_DB.add(drink);
		
		return drink;
	}

	@Override
	public void showFoodMenu() {
		System.out.println("**Aria FOOD MENU: ");
		for (Food food : AriaPos_Db.FOODS_DB) {
			System.out.println("Food: " + food.name + " - Price $" + food.price);
		}

	}

	@Override
	public void showDrinkMenu() {
		System.out.println("**Aria DRINK MENU");
		for (Drink drink: AriaPos_Db.DRINKS_DB) {
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
