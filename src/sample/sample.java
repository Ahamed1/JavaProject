package sample;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(10, 20);
		
	    sum(10, 20, 30);	
		
		sum(10.20, 20.35,30.34);
		
		sum(10,20.33f,40.55);
		
		 
		 System.out.println(Math.max(10.10, 20.20));
	}
	
	public static void sum(int x, int y) {
		int c = x * y;
		System.out.println(c);
				
	}
	
	public static void sum(int x, int y, int z) {
		int c = x + y - z;
		System.out.println(c);
		  
		
				
	}
	
	public static void sum(double x, double y, double z) {
		double c = x + y - z;
		System.out.println(c);
		  		
				
	}
	
	public static void sum(int x, float y, double z) {
		double c = x + y + z;
		System.out.println(c);
	}



}