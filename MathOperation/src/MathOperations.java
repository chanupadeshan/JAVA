
public class MathOperations {
	public void drawMultiplocationTable (int number,int range) {
		int i;
		for( i =1;i<=range;i++) {
			System.out.println(number + "x" + i + "=" + (number*i));
		}
		
	}
	
	
	public int factorial(int number) {
			int i;
			int factorialnum = 1 ;
			for (i=number;i>=1;i--) {
				factorialnum =factorialnum* i;
			}
			return factorialnum;
		}
	
}
