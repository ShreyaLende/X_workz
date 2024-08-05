class MetalRunner{
	public static void main(String[] args){
		System.out.println("runninng main in MetalRunner");
		
		Metal metal=new Metal();
		metal.name="Gold";
		double cost=metal.cost;
		System.out.println("metal name:"+metal.name);
		System.out.println("metal cost:"+cost);
		
		
		Metal metal1=new Metal("Dimand");
		System.out.println("metal name:" +metal1.name);
		
		Metal metal2=new Metal(60000);
		System.out.println("metal name:" +metal2.cost);
		
		Metal metal3=new Metal("Silver",6000);
		System.out.println("metal name:" +metal3.name);
		System.out.println("metal name:" +metal3.cost);
		
		
		System.out.println("///////////////");
		Perfume perfume=new Perfume("fogg",600);
		System.out.println("Perfume Brand:" +perfume.brand);
		System.out.println("Perfume price:" +perfume.price);
		
		Perfume perfume1=new Perfume("fogg",600,50);
		System.out.println("Perfume Brand:" +perfume1.brand);
		System.out.println("Perfume price:" +perfume1.price);
		System.out.println("Perfume quantityIngrams:" +perfume1.quantityIngrams);
		
		Perfume perfume2=new Perfume("Rose",600,100,500);
		System.out.println("Perfume Brand:" +perfume2.brand);
		System.out.println("Perfume price:" +perfume2.price);
		System.out.println("Perfume quantityIngrams:" +perfume2.quantityIngrams);
		System.out.println("Perfume cost:" +perfume2.cost);
		
		System.out.println("///////////////");
		CofeePowder CofeePowder=new CofeePowder("Levista");
		System.out.println("CofeePowder company:" +CofeePowder.Company);
		
		CofeePowder cofeePowder1=new CofeePowder("Brue",2.0,200,"10/12/2024");
		System.out.println("CofeePowder company:" +cofeePowder1.Company);
		System.out.println("CofeePowder weight:" +cofeePowder1.weightInKg);
		System.out.println("CofeePowder cost:" +cofeePowder1.cost);
		System.out.println("CofeePowder manfDate:" +cofeePowder1.manfDate);
		
		CofeePowder CofeePowder2=new CofeePowder("Levista","10/12/2024");
		System.out.println("CofeePowder company:" +CofeePowder2.Company);
		System.out.println("CofeePowder manfDate:" +CofeePowder2.manfDate);
		
		CofeePowder CofeePowder3=new CofeePowder(5);
		System.out.println("CofeePowder weight:" +CofeePowder3.weightInKg);
	}
}