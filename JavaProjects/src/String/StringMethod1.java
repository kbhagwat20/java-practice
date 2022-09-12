package String;

public class StringMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Will Byers";
		String name1 = "Will Byers";
		String name2 = "Will Robinson";
		String name3 = "Krupali";
		
		for(int i=0; i<name.length();i++) {
			System.out.print(name.charAt(i) + " ");
		}
		
		System.out.println();
		
		if(name.equals(name2)) {
			System.out.println("names are equal");
		}
		else {
			System.out.println("names are not equal");
		}
		
		if(name.compareTo(name2)>0) {
			System.out.println("name > name2");
		}
		else {
			System.out.println("name <= name2");
		}
		
		System.out.println("Comparing the lecture challenge");
		
		if(name3.compareTo(name)>0) {
			System.out.print("name3 > name");
		}
		else {
			System.out.print("name3 <= name");
		}
		

	}

}
