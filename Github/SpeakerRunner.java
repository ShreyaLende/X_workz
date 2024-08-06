class SpeakerRunner{
	public static void main(String[] args){
		System.out.println("running main in Speakerrunner");
		
		Speaker speaker=new Speaker("large");
		speaker.cost=1000;
		speaker.setSpeaker("best");
		speaker.details();
		
		System.out.println("\n");
		Speaker speaker1=new Speaker("Mideum");
		speaker.cost=2000;
		speaker.setSpeaker("good");
		speaker.details();
		
		System.out.println("\n");
		Speaker speaker2=new Speaker("normal");
		speaker.cost=3000;
		speaker.setSpeaker("better");
		speaker.details();
		
		System.out.println("\n");
		Rocket rocket=new Rocket(2);
		double speed=1000;
		rocket.setRocket(5000);
		rocket.details();
		
		System.out.println("\n");
		Rocket rocket1=new Rocket(4);
		double speed1=2000;
		rocket.setRocket(6000);
		rocket.details();
		
		System.out.println("\n");
		Rocket rocket2=new Rocket(3);
		double speed2=3000;
		rocket.setRocket(6000);
		rocket.details();
		
		System.out.println("\n");
	    Chocolate chocolate=new Chocolate(50);
	    chocolate.brand="Cadbury";
	    chocolate.setChocolate("chocolate");
		chocolate.details();
		
		System.out.println("\n");
	    Chocolate chocolate1=new Chocolate(100);
	    chocolate.brand="Amul";
	    chocolate.setChocolate("milk");
		chocolate.details();
		
		System.out.println("\n");
	    Chocolate chocolate2=new Chocolate(200);
	    chocolate.brand="Hershey's";
	    chocolate.setChocolate("chocolate");
		chocolate.details();
		
		System.out.println("\n");
		Projector projector=new Projector("DLP");
		projector.company="HP";
		projector.setColour("black");
	    projector.details();
		
		System.out.println("\n");
		Projector projector1=new Projector("LCD");
		projector.company="Samsung";
		projector.setColour("White");
	    projector.details();
		
		System.out.println("\n");
		Projector projector2=new Projector("LCOS");
		projector2.company="black";
		projector.setColour("White");
	    projector.details();
		
		System.out.println("\n");
		Paper paper=new Paper("A4");
		paper.colour="white";
		paper.setQuality(true);
	    paper.details();
		
		System.out.println("\n");
		Paper paper1=new Paper("A3");
		paper.colour="black";
		paper.setQuality(false);
	    paper.details();
		
		System.out.println("\n");
		Paper paper2=new Paper("A5");
		paper.colour="Blue";
		paper.setQuality(false);
	    paper.details();
	}
}