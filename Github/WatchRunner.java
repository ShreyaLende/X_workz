class WatchRunner{
	public static void main(String[] args){
		
		Watch watch1=new Watch("Digital",true);
		watch1.price=5000;
		System.out.println("watch price:"+watch1.price);
		System.out.println("watch brand:"+watch1.brand);
		System.out.println("watch type:"+watch1.watchType);
		System.out.println("watch type:"+watch1.wantsToWatch);
		
		System.out.println("\n");
		Watch watch2=new Watch("Analog",false);
		watch2.price=1000;
		System.out.println("watch price:"+watch2.price);
		System.out.println("watch brand:"+watch2.brand);
		System.out.println("watch type:"+watch2.watchType);
		System.out.println("watch type:"+watch2.wantsToWatch);
		
		System.out.println("\n");
		Cable cable1=new Cable("USB",400);
		cable1.length=5;
		System.out.println("Cable length:"+cable1.length);
		System.out.println("Cable cost:"+cable1.cost);
		System.out.println("Cable type:"+cable1.Type);
		System.out.println("Cable connecting:"+cable1.isConnected);
		
		System.out.println("\n");
		Cable cable2=new Cable("Ethernet",500);
		cable2.length=10;
		System.out.println("Cable length:"+cable2.length);
		System.out.println("Cable cost:"+cable2.cost);
		System.out.println("Cable type:"+cable2.Type);
		System.out.println("Cable connecting:"+cable2.isConnected);
		
		System.out.println("\n");
		Radio radio1=new Radio("Philips",100);
		radio1.Frequency=5;
		System.out.println("Radio frequency:"+radio1.Frequency);
		System.out.println("Radio on:"+radio1.isOn);
		System.out.println("Radio type:"+radio1.Brand);
		System.out.println("Radio volume:"+radio1.volumeLevel);
		
		System.out.println("\n");
		Radio radio2=new Radio("Sony",100);
		radio2.Frequency=10;
		System.out.println("Radio frequency:"+radio2.Frequency);
		System.out.println("Radio on:"+radio2.isOn);
		System.out.println("Radio type:"+radio2.Brand);
		System.out.println("Radio volume:"+radio2.volumeLevel);
		
		System.out.println("\n");
		Trumpet trumpet1=new Trumpet("Trumpet A",100);
		trumpet1.cost=5000;
		System.out.println("Trumpet cost:"+trumpet1.cost);
		System.out.println("Trumpet tune:"+trumpet1.isInTune);
		System.out.println("Trumpet type:"+trumpet1.Type);
		System.out.println("Trumpet weight:"+trumpet1.weightInkg);
		
		System.out.println("\n");
		Trumpet trumpet2=new Trumpet("Trumpet B",200);
		trumpet2.cost=10000;
		System.out.println("Trumpet cost:"+trumpet2.cost);
		System.out.println("Trumpet tune:"+trumpet2.isInTune);
		System.out.println("Trumpet type:"+trumpet2.Type);
		System.out.println("Trumpet weight:"+trumpet2.weightInkg);
		
		System.out.println("\n");
		Harmonium harmonium1=new Harmonium(1000,true);
		harmonium1.color="Brown";
		System.out.println("Harmonium color:"+harmonium1.color);
		System.out.println("Harmonium brand:"+harmonium1.brand);
		System.out.println("Harmonium type:"+harmonium1.price);
		System.out.println("Harmonium weight:"+harmonium1.isElectric);
		
		System.out.println("\n");
		Harmonium harmonium2=new Harmonium(3000,false);
		harmonium2.color="Red";
		System.out.println("Harmonium color:"+harmonium2.color);
		System.out.println("Harmonium brand:"+harmonium2.brand);
		System.out.println("Harmonium type:"+harmonium2.price);
		System.out.println("Harmonium weight:"+harmonium2.isElectric);
		
		System.out.println("\n");
		Pendulum pendulum1=new Pendulum("vertical",2000);
		pendulum1.lengthIncm=15;
		System.out.println("Pendulum length:"+pendulum1.lengthIncm);
		System.out.println("Pendulum type:"+pendulum1.Type);
		System.out.println("Pendulum Angle:"+pendulum1.Angle);
		System.out.println("Pendulum cost:"+pendulum1.cost);
		
		System.out.println("\n");
		Pendulum pendulum2=new Pendulum("Horizantal",3000);
		pendulum2.lengthIncm=15;
		System.out.println("Pendulum length:"+pendulum2.lengthIncm);
		System.out.println("Pendulum type:"+pendulum2.Type);
		System.out.println("Pendulum Angle:"+pendulum2.Angle);
		System.out.println("Pendulum cost:"+pendulum2.cost);
		
		System.out.println("\n");
		Syringe Syringe1=new Syringe(3.5,400);
		Syringe1.size="S";
		System.out.println("Syringe volume:"+Syringe1.volumeinmilimtrs);
		System.out.println("Syringe size:"+Syringe1.size);
		System.out.println("Syringe needlesize:"+Syringe1.needlesize);
		System.out.println("Syringe cost:"+Syringe1.cost);
		
		System.out.println("\n");
		Syringe Syringe2=new Syringe(4.5,300);
		Syringe2.size="M";
		System.out.println("Syringe volume:"+Syringe2.volumeinmilimtrs);
		System.out.println("Syringe size:"+Syringe2.size);
		System.out.println("Syringe needlesize:"+Syringe2.needlesize);
		System.out.println("Syringe cost:"+Syringe2.cost);
		
		System.out.println("\n");
		Mask mask1=new Mask(true,40);
		mask1.color="black";
		System.out.println("Mask color:"+mask1.color);
		System.out.println("Mask material:"+mask1.Material);
		System.out.println("Mask reusable:"+mask1.isReusable);
		System.out.println("Mask cost:"+mask1.cost);
		
		System.out.println("\n");
		Mask mask2=new Mask(true,50);
		mask2.color="white";
		System.out.println("Mask color:"+mask2.color);
		System.out.println("Mask material:"+mask2.Material);
		System.out.println("Mask reusable:"+mask2.isReusable);
		System.out.println("Mask cost:"+mask2.cost);
		
		System.out.println("\n");
		Mug mug1=new Mug(100,3);
		mug1.Size="large";
		System.out.println("Mug size:"+mug1.Size);
		System.out.println("Mug material:"+mug1.Material);
		System.out.println("Mug liters:"+mug1.liters);
		System.out.println("Mug cost:"+mug1.price);
		
		System.out.println("\n");
		Mug mug2=new Mug(200,4);
		mug2.Size="large";
		System.out.println("Mug size:"+mug2.Size);
		System.out.println("Mug material:"+mug2.Material);
		System.out.println("Mug liters:"+mug2.liters);
		System.out.println("Mug cost:"+mug2.price);
		
		System.out.println("\n");
		Straightener straightener=new Straightener("ikonic",true);
		System.out.println("company of straightener is:"+straightener.companyOfStrghtner);
		System.out.println("is the straightener is good:"+straightener.isItGood);
		System.out.println("cost of straightener is:"+straightener.costOfStrghtner);
		straightener.multiFunctnality="yes";
		System.out.println("straightener multiFunctnality :"+straightener.multiFunctnality);
		System.out.println("cost of straightener is:"+straightener.costOfStrghtner);
		
		
		System.out.println("\n");
		Straightener straightener1=new Straightener("dyson",false);
		System.out.println("company of straightener1 is:"+straightener1.companyOfStrghtner);
		System.out.println("is the straightener1 is good:"+straightener1.isItGood);
		System.out.println("cost of straightener1 is:"+straightener1.costOfStrghtner);
		straightener1.multiFunctnality="no";
		System.out.println("straightener1 multiFunctnality :"+straightener1.multiFunctnality);
		

		System.out.println("\n");
		Anklet anklet=new Anklet("belgaum",50000);
		System.out.println("anklet brought from:"+anklet.ankletBroughtFrom);
		System.out.println("anklet price is:"+anklet.ankletPrice);
		System.out.println("anklet name is:"+anklet.ankletName);
		anklet.ankletCarrots="22-carrots";
		System.out.println("anklet carrots is:"+anklet.ankletCarrots);
		System.out.println("anklet price is:"+anklet.ankletPrice);
		
		System.out.println("\n");
		Anklet anklet1=new Anklet("chikkodi",30000);
		System.out.println("anklet brought from:"+anklet1.ankletBroughtFrom);
		System.out.println("anklet price is:"+anklet1.ankletPrice);
		System.out.println("anklet name is:"+anklet1.ankletName);
		anklet1.ankletCarrots="24-carrots";
		System.out.println("anklet carrots is:"+anklet1.ankletCarrots);
		
	}
}