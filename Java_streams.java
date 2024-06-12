package JavaStreams;

import java.util.ArrayList;

public class Java_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Akash");
		names.add("Annai");
		names.add("Akhil");
		names.add("Suresh");
		names.add("Ramesh");
		
		int count = 0;
		
		for(int i = 0; i<names.size(); i++) {
			
			String name = names.get(i);
			if(name.startsWith("A")) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
