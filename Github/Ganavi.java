class Ganavi{
	String email;
	Clip clip;
	public Ganavi(String email,Clip clip){
		this.email=email;
		this.clip=clip;
	}
	public void details(){
		System.out.println("Ganavi email:"+this.email);
		clip.display();
	}
}