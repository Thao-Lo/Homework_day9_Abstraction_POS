package pos.data;

public class Food {
	public String name;
	public double price;
	public int quantity;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
