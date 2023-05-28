package problemSolutionLeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Twosum {
	
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList<>();
		int count = scanner.nextInt();
		
		for(int k=0; k<count; k++)
		{
			int num = scanner.nextInt();
			arraylist.add(num);
		}
		
		for(int num : arraylist)
		{
			System.out.println(num);
		}
		
	}

}
