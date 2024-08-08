class Key{
	String brand;
	double weight;
 public Key(String brand, double weight){
	 this.brand=brand;
	 this.weight=weight;
	System.out.println("create key");
}
public void display(){
	System.out.println("key brand:"+this.brand);
	System.out.println("key weight:"+this.weight);
	
}
}