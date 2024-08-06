class Chocolate
{
	String brand;
	int price;
	String flaver;
	String size="large";
	public Chocolate(int price)
	{
		this.price=price;
		System.out.println("create chocolate");
	}
	public void setChocolate(String flaver){
		this.flaver=flaver;
	}
	public void details(){
		System.out.println("Chocolate brand :"+brand);
		System.out.println("Chocolate price:"+price);
		System.out.println("Chocolate flaver:"+flaver);
		System.out.println("Chocolate size:"+size);
		
	}

}