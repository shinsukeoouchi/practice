public class Book extends TangibleAsset{
	private String isbn;
	private String name;
	private int price;
	private String color;

	public Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
	public String getName(){return this.name;}
	public int getPrice(){return this.price;}
	public int getColor(){return this.color;}
	
}
