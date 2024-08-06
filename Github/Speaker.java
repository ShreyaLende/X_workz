class Speaker{
	String brand="sony";
	String size;
	double cost;
	String output;
	public Speaker(String size){
		this.size=size;
		System.out.println("create Speaker");
	}
	public void setSpeaker(String output){
		this.output=output;
	}
	public void details(){
		System.out.println("speaker brand :"+brand);
		System.out.println("speaker size:"+size);
		System.out.println("speaker output:"+output);
		System.out.println("speaker cost:"+cost);
		
	}
}