public class Computer extends TangibleAsset {
	private String name;
	private int price;
	private String color;
	private String CName;
  
	public Computer(String name, int price, String color, String CName) {
		super(name, price, color);
		this.CName = CName;
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
