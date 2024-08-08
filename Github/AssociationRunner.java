class AssociationRunner{
	public static void main(String[] args){
		System.out.println("running main in Association");
		
		Key key=new Key("Honda",20);
		KeyBunch keyBunch=new KeyBunch("steel",key);
		keyBunch.details();
		System.out.println("------------------");
		
		
		Key key1=new Key("Toyota",40);
		KeyBunch keyBunch1=new KeyBunch("plastic",key1);
		keyBunch1.details();
		System.out.println("------------------");
		
		Clip clip=new Clip("black","Hair clip");
		Ganavi ganavi=new Ganavi("Ganavi@gmail.com",clip);
		ganavi.details();
		System.out.println("------------------");
		
		Clip clip1=new Clip("silver","paper clip");
		Ganavi ganavi1=new Ganavi("Ganavi123@gmail.com",clip1);
		ganavi1.details();
		System.out.println("------------------");
		
		Knief knief=new Knief(2,5);
		Ananya ananya=new Ananya(1245267289l,knief);
		ananya.details();
		System.out.println("------------------");
		
		Knief knief1=new Knief(1,4);
		Ananya ananya1=new Ananya(9886454630l,knief1);
		ananya1.details();
		System.out.println("------------------");
		
		
		
	}
}