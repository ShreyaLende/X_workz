class Perfume{
		String brand;
		double cost;
		int price;
		int quantityIngrams;
		public Perfume(){
			System.out.println("create Perfume");
		}
		public Perfume(String brand, int price){
			this.brand=brand;
			this.price=price;
			System.out.println("create Perfume");
		}
		public Perfume(String brand, int price,int quantityIngrams){
			this.brand=brand;
			this.price=price;
			this.quantityIngrams=quantityIngrams;
			System.out.println("create Perfume price ,brand and quantity");
		}
		public Perfume(String brand, int price,int quantityIngrams,double cost){
			this.brand=brand;
			this.price=price;
			this.quantityIngrams=quantityIngrams;
			this.cost=cost;
			System.out.println("create Perfume price ,brand and quantity,cost");
	}
}