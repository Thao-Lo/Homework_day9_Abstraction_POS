package pos.data;

public class Employee {

	public String name;
	public String id;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
