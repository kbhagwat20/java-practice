package String;
import java.util.Scanner;

public class StringMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname;
		String firstname;
		String lastname;
		
		Scanner sc = new Scanner(System.in);
		fullname = sc.nextLine();
		
		int indexOfSpace = fullname.indexOf(" ");
		
		firstname = fullname.substring(0, indexOfSpace);
		lastname =  fullname.substring(indexOfSpace + 1);
		
		String upper = firstname.toUpperCase();
		String lower = lastname.toLowerCase();
		
		System.out.println("Fullname is:"+ fullname);
		System.out.println("Firstname is:"+ firstname);
		System.out.println("Lastname is:"+ lastname);
		System.out.println("firstname upper:"+ upper);
		System.out.println("lastname lower:"+ lower);
		
		

	}

}
