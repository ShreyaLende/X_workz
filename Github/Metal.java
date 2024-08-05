class Metal{
	String name;
	double cost;
	public Metal(){
	System.out.println("running main in Metal");
	}
	public Metal(String name){
		this.name=name;
		System.out.println("Metal name");
	}
	public Metal(double cost){
		this.cost=cost;
		System.out.println("Metal cost");
	}
	public Metal(String name,double cost){
		this.cost=cost;
		System.out.println("Metal cost and name");
	}
	
	
	
}