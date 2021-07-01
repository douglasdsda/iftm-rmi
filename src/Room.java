public class Room {

	int type;
	String capacity;
	double price;
	int amount;

	public Room(int type, String capacity, int amount, double price) {
		super();
		this.type = type;
		this.capacity = capacity;
		this.amount = amount;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[type=" + type + ", capacity=" + capacity + ", amount=" + amount + ", price=" + price + "]";
	}

	public int gettype() {
		return type;
	}

	public void settype(int type) {
		this.type = type;
	}

	public String getcapacity() {
		return capacity;
	}

	public void setcapacity(String capacity) {
		this.capacity = capacity;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setprice(double price) {
		this.price = price;
	}

	public int getamount() {
		return amount;
	}

	public void setamount(int amount) {
		this.amount = amount;
	}
	
	 

}