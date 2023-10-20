package pos.data;

import java.util.ArrayList;

public class OrderItem {
	public ArrayList<Food> foodOrdered;

	public ArrayList<Drink> drinkOrdered;

	public ArrayList<Employee> employee;

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItem(ArrayList<Food> foodOrdered, ArrayList<Drink> drinkOrdered, ArrayList<Employee> employee) {
		super();
		this.foodOrdered = foodOrdered;
		this.drinkOrdered = drinkOrdered;
		this.employee = employee;
	}

	public ArrayList<Food> getFoodOrdered() {
		return foodOrdered;
	}

	public void setFoodOrdered(ArrayList<Food> foodOrdered) {
		this.foodOrdered = foodOrdered;
	}

	public ArrayList<Drink> getDrinkOrdered() {
		return drinkOrdered;
	}

	public void setDrinkOrdered(ArrayList<Drink> drinkOrdered) {
		this.drinkOrdered = drinkOrdered;
	}

	public ArrayList<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}
	
	

}
