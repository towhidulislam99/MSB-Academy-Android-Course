package problem_Solving;
import java.util.Scanner;

public class Vajok {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 int input = scanner.nextInt();
		 
		 for(int x=1; x<=input; x++)
		 {
			 Scanner scanner2 =  new Scanner(System.in);
			 int input2 = scanner.nextInt();
			 
			 for(int y=1; y<=input2;y++)
				 
			 {
				 if(input2%y==0)
				 {
					 int i =y;
					 System.out.println("Case"+x+":" +y);
				 }
				 
			 }
			 
			 
		 }
		
		
		
	}

}
