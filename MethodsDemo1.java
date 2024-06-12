
public class MethodsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo1 d = new MethodsDemo1();
		
		d.mg();
		d.sn();
		//System.out.println(s);
		gn();

	}
	
	public void mg() {
		
		System.out.println("Void Class");
	}
	
	public String sn() {
		
		System.out.println("String Class");
		return "String Class ni pilichavu ra puka";
	}
	
	/*IF U WANT TO ACCESS METHODS OF UR OWN CLASS WITHOUT CREATING OBJECT, 
	THEN WE HAVE TO USE "static" KEYWORD*/
	
	public static void gn() {
		System.out.println("Objectless Method");
	}

}
