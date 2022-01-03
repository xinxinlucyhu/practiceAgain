
public class Calculator {

  
   public Calculator() {
	   
   }
  
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public double divide(int num1, int num2) {
		return (double)num1/(double)num2;
	}
	
	public double square(int num1, int num2) {
		return Math.pow(num1, num2);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator sum = new Calculator();
		System.out.println(sum.square(2, 3));
		
	}	
	
}
