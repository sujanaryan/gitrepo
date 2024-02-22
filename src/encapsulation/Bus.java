package encapsulation;

public class Bus {

	
	private int speed;
	private int price;
	private int wheels;
	private String color;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bus [speed=" + speed + ", price=" + price + ", wheels=" + wheels + ", color=" + color + "]";
	}
	
	
}
