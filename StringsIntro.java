
public class StringsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is an Object
		
		// There r 2 types of defining a string
		
		String s1= "Madda gudv";
		String s2= "Puku naku";
		
		//String s3 = new String{"Howle"};
		//String s4 = new String{"ah Fine fine"};
		
		String[] spliteds1 = s1.split("g");
		System.out.println(spliteds1[0]);
		String sm = spliteds1[0];
		spliteds1[0].trim();
		
		for(int i= (s1.length())-1; i>= 0; i--) {
			System.out.println(s1.charAt(i));
		}
		

	}

}
