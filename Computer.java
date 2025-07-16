public class Computer extends TangibleAsset {
	private String name;
	private int price;
	private String color;
	private String cName;
  
	public Computer(String name, int price, String color, String cName) {
		super(name, price, color);
		this.cName = cName;
	}
	//TangibleAssetより@overrideできる場合には以下行からのアクセサが不要
	public String getName() {
		return this.name;
	}
  
	public void getPrice(int price) {
		this.price = price;
	}
  
	public String getColor() {
		return this.color;
	}
	public String getCName() {
	return this.cName;
	}
	
}
