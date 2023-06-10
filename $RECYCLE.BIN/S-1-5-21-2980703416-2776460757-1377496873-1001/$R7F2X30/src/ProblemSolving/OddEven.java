package ProblemSolving;
import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		
		System.out.println("How Many data you Want to give: ");
		Scanner scanner1 = new Scanner(System.in);
		int value1 = scanner1.nextInt();
		
		 for(int i=1; i<=value1; i++)
		 {
			 System.out.println("Enter The Value: ");
			 Scanner scanner = new Scanner(System.in);
			 int value = scanner.nextInt();
			 if (value%2 == 0)
			 {
				 System.out.println("Even");
			 }
			
			 else
			 {
				 System.out.println("Odd");
			 }
		 }
		 
		
		
	}
		
}
