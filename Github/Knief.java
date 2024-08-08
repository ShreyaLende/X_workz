class Knief{
	double weight;
	int height;
	
	public Knief(int weight,int height){
		this.weight=weight;
		this.height=height;
		System.out.println("create Knief");
	}
	public void display(){
	System.out.println("Knief weight:"+this.weight);
	System.out.println("Knief height:"+this.height);
	
	}
}