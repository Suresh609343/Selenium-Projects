import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		//ArrayList<String> a = new ArrayList<String>();  - This is for STRING Array's
		
		a.add("Sk");
		a.add("Frr");
		a.add("Vinay");
		
		System.out.println(a.get(2));
		a.add("sobha");
		a.add("Sairam");
		
		for(int i= 0; i<= (a.size())-1; i++){
			
			System.out.println(a.get(i));
		}
		
		System.out.println("***********");
		//Enhanced
		
		for(String b: a) {
			System.out.println(b);
		}
		
		//Check for any value is present in the ArrayList or not 
		
		System.out.println(a.contains("Sal"));
		
		// ***************CONVERT LIST TO ARRAYLIST***************
		
		int[] s = {1,23,45,5,3,53};
		
		List<int[]> sArrayList = Arrays.asList(s);
		sArrayList.add(2,2);
		

	}

}
