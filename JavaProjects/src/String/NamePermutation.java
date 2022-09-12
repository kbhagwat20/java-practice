package String;
import java.util.ArrayList;
import java.util.Scanner;


public class NamePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> firstNames = new ArrayList<>();
		ArrayList<String> lastNames  = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String fullname;
		String first;
		String last;
		int indexOfSpace;
		
		final int NUM_NAME =5;
		for(int i = 0;i<NUM_NAME;i++) {
			System.out.print("Please enter name" + i+ "\t");
			fullname = sc.nextLine();
			indexOfSpace = fullname.indexOf(" ");
			first = fullname.substring(0, indexOfSpace);
			last = fullname.substring(indexOfSpace + 1);
			
			firstNames.add(first);
			lastNames.add(last);
			
			//for permutation
			
			for(int i=0;i<firstNames.size();i++) {
				for(int j=0;j<lastNames.size();j++) {
					System.out.print(firstNames.get(i)+ " ");
					System.out.println(lastNames.get(j));
				}
			}
		}
		
		
		

	}

}
