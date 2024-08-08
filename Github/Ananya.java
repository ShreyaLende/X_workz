class Ananya{
	long mobileNo;
	Knief knief;
	
	public Ananya(long mobileNo,Knief knief){
	this.mobileNo=mobileNo;
	this.knief=knief;
	
	System.out.println("create Ananya");
	}
	public void details(){
		System.out.println("Ananya mobileNo:"+this.mobileNo);
		knief.display();
	}
}