class WardrobeRunner {
        public static void main(String[] args) {
        
        Wardrobe myWardrobe = new Wardrobe();
		
		String name = myWardrobe.material;
        int doors=myWardrobe.numberOfDoors;
        
        
        System.out.println("Default values of myWardrobe:");
        System.out.println("Material: " + myWardrobe.material);
        System.out.println("Number of doors: " + myWardrobe.numberOfDoors);

        
        myWardrobe.material = "Wood";
        myWardrobe.numberOfDoors = 4;

       
        System.out.println("\nUpdated values of myWardrobe:");
        System.out.println("Material: " + myWardrobe.material);
        System.out.println("Number of doors: " + myWardrobe.numberOfDoors);

        Niraksha refNiraksha = new Niraksha();
        String Name = refNiraksha.nickname;
        int Age=refNiraksha.age;
		
        System.out.println("\nDefault values of Niraksha:");
        System.out.println("niraksha: " +refNiraksha.nickname);
        System.out.println("Number of doors: " +refNiraksha.age);
		
		refNiraksha.nickname = "raksha";
        refNiraksha.age = 22;

       
        System.out.println("\nUpdated values of myWardrobe:");
        System.out.println("name: " +refNiraksha.nickname );
        System.out.println("age: " +refNiraksha.age);
       
	   
	    ATM atm = new ATM();
        String AccountNumber = atm.AccountNumber;
        double ammount=atm.ammount;
		
        System.out.println("\nDefault values of ATM:");
        System.out.println("atm: " +atm.AccountNumber);
        System.out.println("check the balence: " +atm.ammount);
		
		atm.AccountNumber = "123456789";
        atm.ammount = 25000;

       
        System.out.println("\nUpdated values of ATM:");
        System.out.println("AcNumber: " +atm.AccountNumber );
        System.out.println("ammount: " +atm.ammount);
       
	    Coin coin = new Coin();
        String material = coin.material;
        int NumberOfCoins=coin.NumberOfCoins;
		
        System.out.println("\nDefault values of Coin:");
        System.out.println("Coin: " +coin.material);
        System.out.println("Coins: " +coin.NumberOfCoins);
		
		coin.material = "Silver";
        coin.NumberOfCoins = 10;

       
        System.out.println("\nUpdated values of ATM:");
        System.out.println("Coin: " +coin.material );
        System.out.println("Coins: " +coin.NumberOfCoins);
       
	    Furniture furniture = new Furniture();
        int NumberOfFurniture = furniture.NumberOfFurniture;
        String Color=furniture.Color;
		
        System.out.println("\nDefault values of Furniture:");
        System.out.println("number: " +furniture.NumberOfFurniture);
        System.out.println("Color: " +furniture.Color);
		
		furniture.NumberOfFurniture= 2;
        furniture.Color = "Brown";

       
        System.out.println("\nUpdated values of furniture.");
        System.out.println("number: " +furniture.NumberOfFurniture );
        System.out.println("Color: " +furniture.Color);
		
		Aeroplane aeroplane = new Aeroplane();
		String AeroplaneColor=aeroplane.AeroplaneColor;
        int AeroplaneWheels = aeroplane.AeroplaneWheels;
		
        System.out.println("\nDefault values of Aeroplane:");
        System.out.println("number of Wheels: " +aeroplane.AeroplaneColor);
        System.out.println("AeroplaneColor: " +aeroplane.AeroplaneColor);
		
		aeroplane.AeroplaneWheels= 2;
        aeroplane.AeroplaneColor = "White";

       
        System.out.println("\nUpdated values of Aeroplane.");
        System.out.println("Wheels: " +aeroplane.AeroplaneWheels );
        System.out.println("AeroplaneColor: " +aeroplane.AeroplaneColor);
		
		CCTV cctv = new CCTV();
		String CCTVColour=cctv.CCTVColour;
        int numberofCCTV = cctv.numberofCCTV;
		
        System.out.println("\nDefault values of CCTV:");
        System.out.println("Colour: " +cctv.CCTVColour);
        System.out.println("numbers: " +cctv.numberofCCTV);
		
		cctv.CCTVColour= "Black";
        cctv.numberofCCTV= 4;

       
        System.out.println("\nUpdated values of CCTV.");
        System.out.println("Colour: " + cctv.CCTVColour);
		System.out.println("numbers: " +cctv.numberofCCTV);
		
		Tripod tripod = new Tripod();
		String Tripodcolour=tripod.Tripodcolour;
        int height = tripod.height;
		
        System.out.println("\nDefault values of Tripod:");
        System.out.println("colour: " +tripod.Tripodcolour);
        System.out.println("height: " +tripod.height);
		
		tripod.Tripodcolour= "Black";
        tripod.height= 60;

       
        System.out.println("\nUpdated values of Tripod.");
        System.out.println("colour: " + tripod.Tripodcolour);
		System.out.println("numbers: " +tripod.height);
		
		Zip zip = new Zip();
		String size=zip.size;
        int length = zip.length;
		
        System.out.println("\nDefault values of Zip:");
        System.out.println("Size: " +zip.size);
        System.out.println("length: " +zip.length);
		
		zip.size= "M";
        zip.length= 10;

       
        System.out.println("\nUpdated values of Zip.");
        System.out.println("size: " + zip.size);
		System.out.println("length: " +zip.length);
		
		Helmet helmet = new Helmet();
		String Size=helmet.Size;
        String material1 = helmet.material1;
		
        System.out.println("\nDefault values of helmet:");
        System.out.println("Size: " +helmet.Size);
        System.out.println("Material1: " +helmet.material1);
		
		helmet.Size= "s";
        helmet.material1= "glass";

       
        System.out.println("\nUpdated values of HillStation.");
        System.out.println("size: " + helmet.Size);
		System.out.println("Material1: " +helmet.material1);
		
		HillStation hillStation = new HillStation();
		String HillName=hillStation.HillName;
        int meters = hillStation.meters;
		
        System.out.println("\nDefault values of HillStation:");
        System.out.println("Hillname: " +hillStation.HillName);
        System.out.println("meters: " +hillStation.meters);
		
		hillStation.HillName= "NandiHills";
        hillStation.meters= 20000;

       
        System.out.println("\nUpdated values of HillStation.");
        System.out.println("HillName: " + hillStation.HillName);
		System.out.println("meters: " +hillStation.meters);
		
		Camara camara= new Camara();
		String model=camara.model;
        int price = camara.price;
		
        System.out.println("\nDefault values of Camara:");
        System.out.println("model: " +camara.model);
        System.out.println("price: " +camara.price);
		
		camara.model= "Model";
        camara .price= 20000;

       
        System.out.println("\nUpdated values of Camara.");
        System.out.println("model: " + camara.model);
		System.out.println("price: " +camara.price);
		
		Hat hat= new Hat();
		String Material1=hat.Material1;
        int price1 = hat.price1;
		
        System.out.println("\nDefault values of Hat:");
        System.out.println("Material1: " +hat.Material1);
        System.out.println("price1: " +hat.price1);
		
		hat.Material1= "Cotton";
        hat.price1= 30000;

       
        System.out.println("\nUpdated values of Hat.");
        System.out.println("Material1: " + hat.Material1);
		System.out.println("price1: " +hat.price1);
		
		SelfieStick selfiestick=new SelfieStick();
		int amntofSelfiestick=selfiestick.selfiestickAmnt;
		double sizeofSelfiestick=selfiestick.selfiestickSizeinfeet;
		
		System.out.println("\ndefault-values of amntofSelfiestick:"+amntofSelfiestick);
		System.out.println("default-values of sizeofSelfiestick:"+sizeofSelfiestick);
		
		amntofSelfiestick=450;
		sizeofSelfiestick=80.55;
		System.out.println("\nupdated-values:"+amntofSelfiestick);
		System.out.println("updated-values:"+sizeofSelfiestick);
		
		Cloth cloth=new Cloth();
		int amntOfCloth=cloth.clothAmnt;
		String sizeofCloth=cloth.clothSize;
		
		System.out.println("\ndefault-values of amntOfCloth:"+amntOfCloth);
		System.out.println("default-values of sizeofCloth:"+cloth.clothSize);
		
		cloth.clothAmnt=500;
		sizeofCloth="XL";
		System.out.println("\nupdated-values:"+cloth.clothAmnt);
		System.out.println("updated-values:"+sizeofCloth);
		
		Poster1 poster1=new Poster1();
		
		String typeOfPoster=poster1.posterType;
		String posterColouris=poster1.posterColour;
	
		
		System.out.println("\ndefault-values of typeOfPoster: "+typeOfPoster);
		System.out.println("default-values of posterColour:"+posterColouris);
		
		typeOfPoster="Rectangle";
		posterColouris="White";
		
		System.out.println("\nupdated-values of typeOfPoster: "+typeOfPoster);
		System.out.println("updated-values of posterColour:"+posterColouris);
		
		PostBox postbox=new PostBox();
		String areaofpostbox= postbox.postBoxarea;
		int capacityofpb=postbox.postBoxCapacity;
	
		
		System.out.println("\ndefault-values of postboxarea: "+areaofpostbox);
		System.out.println("default-values of capacityofpb"+capacityofpb);
		
		areaofpostbox="kagwad-Belgavi";
		capacityofpb=224;
		
		System.out.println("\nupdated-values of areaofpostbox:"+areaofpostbox);
		System.out.println("updated-values of capacityofpb:"+capacityofpb);
		
		Key key=new Key();
		String keyType=key.typeofKey;
	    int priceofkey=key.keyPrice;
		
		System.out.println("\ndefault-values of keytype:"+keyType);
		System.out.println("default-values of keyprice:"+priceofkey);
		
		keyType="master-key";
		priceofkey=45;
		System.out.println("\nupdated-values:"+keyType);
		System.out.println("updated-values:"+priceofkey);
		
		Tree tree=new Tree();
		double treeheight=tree.treeHeightinfeet;
		String nameoftree=tree.treeName;
		
		System.out.println("\ndefault-values of tree height:"+treeheight);
		System.out.println("default-values of tree name:"+nameoftree);
		
		treeheight=80;
		nameoftree="neem";
		System.out.println("\nupdated-values of tree height:"+treeheight);
		System.out.println("updated-values of tree name:"+nameoftree);
		
		
    }
}