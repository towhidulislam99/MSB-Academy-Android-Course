package problem_Solving;
import java.util.Scanner;

public class oddEven {
	
public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		int value1 = scanner1.nextInt();
		
		 for(int i=1; i<=value1; i++)
		 {
			 Scanner scanner = new Scanner(System.in);
			 int value = scanner.nextInt();
			 if (value%2 == 0)
			 {
				 System.out.println("even");
			 }
			
			 else
			 {
				 System.out.println("odd");
			 }
		 }
		 
		
		
	}

}


