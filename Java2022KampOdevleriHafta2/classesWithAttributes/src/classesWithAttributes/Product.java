package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount,String renk) //Bu parametreleri verirsem kullandırırım sana demek new yaparsak değerleri vermeliyiz 
	{
		System.out.println("Yapıcı Blok Çalıştı");
		this.id=id;
		this.renk=renk;
		this.name=name;
		this.price=price;
		this.description=description;
		this.stockAmount=stockAmount;
	}
	
	public Product() {}
	//Product classını bir parametreli bir parametresiz yaptık ki main classında ister değerleri get set kullanmadan parantez içinde yazalım ister açıklama satırındaki gibi ayrı ayrı yapalım
	
	
	
	//attribute / field diyebiliriz
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		//this.id = id; //this içinde bulunduğumuz class anlamında
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public void setKod(String kod) {
		this.kod = kod;
	}
	public String getKod() {
		return this.name.substring(0,1)+id;
	}
	
}
