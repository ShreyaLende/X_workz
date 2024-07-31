class Mask{
	String Material="Cotton";
	String color;
	boolean isReusable;
	double cost;
	
	public Mask(boolean isReusableLocal, double costLocal){
		System.out.println("create Mask");
		isReusable=isReusableLocal;
		cost=costLocal;
	}
}