package problem_Solving;
import java.util.Scanner;


public class Sumofnumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for(int i=1; i<=input;i++)
		{
			
	        int[] num = new int[5];
			Scanner scanner1 = new Scanner(System.in);
			for(int j=0;j<4;j++)
			{
				num[j] = scanner1.nextInt();
				int sum = num[0]+num[4];
				
			}
			
			System.out.println(num[0]);
			
		}
		
		
		
	}

}
