package String;

public class StringBuilderFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Krupali Bhagwat");
		
		sb.append(" is awsome");
		System.out.println(sb);
		
		sb.insert(8," philip ");
		System.out.println(sb);
		
		sb.replace(0, 8,"Tejaswini");
		System.out.println(sb);
		
		sb.delete(10, 16);
		System.out.println(sb);
		
		sb.replace(0, 9,"Dr");
		System.out.println(sb);

	}

}
