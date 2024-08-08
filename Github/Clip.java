class Clip{
	String color;
	String type;
	public Clip(String color,String type){
		this.color=color;
		this.type=type;
		System.out.println("create clip");
	}
	public void display(){
		System.out.println("Clip color:"+this.color);
		System.out.println("Clip type:"+this.type);
	}
}