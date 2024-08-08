class KeyBunch{
	String material;
	Key key;
	
	public KeyBunch (String material,Key key){
		this.material=material;
		this.key=key;
	}
	public void details(){
		System.out.println("key material:"+this.material);
		key.display();
	}
}