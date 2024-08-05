class Candle{
	double length;
	double price;
	String fragrance;


public Candle(double length, double price,String fragrance){
	this.length=length;
	this.price=price;
	this.fragrance=fragrance;
	System.out.println("create Candle length, price and fragrance");
}

 Candle(double length){
	 this.length=length;
	System.out.println("create Candle length");
 }
 Candle(double price,double length ){
	 this.price=price;
	 this.length=length;
	 System.out.println("create Candle price and length");
 }
 Candle(String fragrance){
	 System.out.println("create Candle fragrance");
	 this.fragrance=fragrance;
}
Candle(double price, String fragrance){
	this.price=price;
	this.fragrance=fragrance;
	System.out.println("create Candle fragrance and price");
}
}