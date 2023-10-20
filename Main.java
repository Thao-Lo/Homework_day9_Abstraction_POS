package main;

import java.util.Scanner;

import be5_day10_OOP_abstract.PosService;
import be5_day10_OOP_abstract.Restaurant_Db;
import pos.data.Restaurant;

public class Main {
	final static int ADD_FOOD_ITEM = 1;
	final static int ADD_DRINK_ITEM = 2;
	final static int SHOW_FOOD_MENU = 3;
	final static int SHOW_DRINK_MENU = 4;
	final static int LOG_OUT = 5;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Restaurant_Db.init();

		System.out.print("Please enter your restaurant ID: ");
		String id = keyboard.nextLine();
		System.out.print("Please enter your restaurant Password: ");
		String password = keyboard.nextLine();

		String restaurantName = dologin(id, password);
		PosService service = PosService.getPosServiceBaseOnRestrotName(restaurantName);

		int homepageOption = 0;

		do {
			showHomePage();
			System.out.print("Please choose a option: ");
			homepageOption = keyboard.nextInt();

			selectedHomepageOption(service, homepageOption);

		} while (homepageOption != LOG_OUT);

	}

	public static void selectedHomepageOption(PosService service, int homepageOption) {
		Scanner keyboard = new Scanner(System.in);

		String addMore = null;
		switch (homepageOption) {

		case ADD_FOOD_ITEM:
			do {
				service.addNewFoodItem(keyboard);
				keyboard.nextLine();

				System.out.print("Add more? Y or N: ");
				addMore = keyboard.nextLine();

			} while (addMore.equals("Y"));

			break;

		case ADD_DRINK_ITEM:
			do {
				service.addNewDrinkItem(keyboard);

				System.out.print("Add more? Y or N: ");
				addMore = keyboard.nextLine();

			} while (addMore.equals("Y"));

			break;
		case SHOW_FOOD_MENU:
			service.showFoodMenu();
			
			break;
		case SHOW_DRINK_MENU:
			service.showDrinkMenu();			
			break;
			
		case LOG_OUT:
				System.out.println("See you again");
			break;

		}
	}

	public static void showHomePage() {
		System.out.println("1. Add Food Item");
		System.out.println("2. Add Drink Item");
		System.out.println("3. Show Food Menu");
		System.out.println("4. Show Drink Menu");
		System.out.println("5. Logout");
	}

	public static String dologin(String id, String password) {

		for (int i = 0; i < Restaurant_Db.RESTAURANTS_DB.size(); i++) {
			if (Restaurant_Db.RESTAURANTS_DB.get(i).id.equals(id)
					&& Restaurant_Db.RESTAURANTS_DB.get(i).password.equals(password)) {
				return Restaurant_Db.RESTAURANTS_DB.get(i).name;
			}
		}
		return null;
	}

}
