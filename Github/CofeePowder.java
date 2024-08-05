class CofeePowder{
		String Company;
		int cost;
		double weightInKg;
		String manfDate;
		public CofeePowder(){
			System.out.println("create CofeePowder");
		}
		public CofeePowder(String Company){
			this.Company=Company;
			System.out.println("create CofeePowder Company");
		}
	public CofeePowder(String Company, double weightInKg, int cost , String manfDate){
			this.Company=Company;
			this.weightInKg=weightInKg;
			this.cost=cost;
			this.manfDate=manfDate;
			System.out.println("create CofeePowder Company,weight,cost and manfdate");
		}	
		public CofeePowder(String Company, String manfDate){
			this.Company=Company;
			this.manfDate=manfDate;
			System.out.println("create CofeePowder Company and manfdate");
}
        public CofeePowder(double weightInKg){
			this.weightInKg=weightInKg;
			System.out.println("create CofeePowder weight");
}
}