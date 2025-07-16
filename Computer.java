public class Computer extends TangibleAsset {
	private String name;
	private int price;
	private String color;
  
	public Computer(String name, int price, String color) {
		super(name, price, color);
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
  
	public void getPrice(int price) {
		this.price = price;
	}
  
	public String getColor() {
		return this.color;
	}
}
