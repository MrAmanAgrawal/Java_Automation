package pkg1;


public class Day2_Assignment_2 {
	
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
		
		Day2_Assignment_2 abc = new Day2_Assignment_2();
		
		int multiplication_result = abc.multiplication_method(10, 2);
		
		int sub_result = abc.subtract_method(multiplication_result, 2);
		
		int add_result = abc.sum_method(sub_result, 2);
		
		int sub_result1 = abc.subtract_method(add_result, 2);
		
		abc.division_method(sub_result1, 2);
		
		
		
		
		
		
		
		

	}



}

	
	
	
	
	
	

