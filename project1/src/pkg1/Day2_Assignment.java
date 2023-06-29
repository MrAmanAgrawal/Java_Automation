package pkg1;


public class Day2_Assignment {
	
public int sum_method(int a, int b) {
		
		int c;
		c = a+b;
		System.out.println("Result of sum_method "+ c);
		return c;
	}
	
	public int subtract_method (int d , int e) {
		
		int f;
		f = d-e;
		System.out.println("Result of subtract method "+ f);
		return f;
	}
	
	public int multiplication_method(int x , int y) {
		int z;
		z = x*y;
		System.out.println("Result of multiplication method "+z);
		return z;	
	}
	
	public void division_method(int a1 , int b1) {
		int c1;
		c1 = a1/b1;
		System.out.println("Final result is "+c1);		
	}
	public static void main(String[] args) {
		 Day2_Assignment xyz = new  Day2_Assignment();
		 
		int sum_results1 = xyz.sum_method(10, 2);
		
		int sum_result2 = xyz.sum_method(sum_results1, 2);
		
		int subtract_results = xyz.subtract_method(sum_result2,2);
		
		int multiplication_results = xyz.multiplication_method(subtract_results, 2);
		
		xyz.division_method(multiplication_results, 2);
		
		
		
	}
	
}
	
	


