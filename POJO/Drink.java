package pos.data;

public class Drink {
	public String name;
	public double price;

	public String type; // cold or hot
	public int quantity;

	public Drink() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drink(String name) {
		super();
		this.name = name;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}