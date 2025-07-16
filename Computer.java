public class Computer extends TangibleAsset {
	private String name;
	private int price;
  private String color;
  
	//コンストラクタ
	public Computer(String name, int price, String color, String name) {
		super(name, price, color);
		this.name = name;
	}
  @Override
	public String getName() {
		return this.name;
	}
  
	@Override
	public void getPrice(int price) {
		this.price = price;
	}
  
	@Override
	public String getColor() {
		return this.color;
	}
}
