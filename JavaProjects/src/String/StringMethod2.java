package String;

public class StringMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name ="Krupali Bhagwat";
		
		String upper = Name.toUpperCase();
		String lower = Name.toLowerCase();
		
		int whereIsB = Name.indexOf("B");
		String lastname = Name.substring(7);
		
		System.out.println("Upper is:"+ upper);
		System.out.println("Lower is:"+ lower);
		System.out.println("Index value is:"+ whereIsB);
		System.out.println("Substring is :"+ lastname);
		

	}

}
