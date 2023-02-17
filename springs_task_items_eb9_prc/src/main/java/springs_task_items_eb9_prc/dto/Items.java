package springs_task_items_eb9_prc.dto;

public class Items {

	String name;
	double price;
	int quantity;
	String manufacturer;

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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void print() {
		System.out.println("Items [name=" + name + ", price=" + price + ", quantity=" + quantity + ", manufacturer="
				+ manufacturer + "]");
	}

}
