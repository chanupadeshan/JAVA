import java.util.Scanner;
public class MathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations m1 = new MathOperations();
		MathOperations m2 = new MathOperations();
		
		Scanner cs = new Scanner(System.in);
		
		m1.drawMultiplocationTable(1, 5);
		
		System.out.println("Enter factorial Number:");
		int factnum = cs.nextInt();
		
		 System.out.println( m2.factorial(factnum));
	}

}
