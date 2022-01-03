
public class MagicCalculator extends Calculator {

	public double squareRoot(int num) {
		return Math.sqrt(num);	
	}
	public double cosine(int num) {
		 return Math.sin(num);
	}
	public double tangent(int num) {
		 return Math.tan(num);
    }
	public double factorial(int num) {
		double fac=1;
		 for(int i = 1; i<=num; i++ ) {
			 fac = fac * i; 
		 }
		 return fac;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MagicCalculator number = new MagicCalculator();
   System.out.println(number.factorial(7));
	}
}
