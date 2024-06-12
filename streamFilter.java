package JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Stream.of("Abhijeeth","Akhil","Ram","Amar","Akash").filter(s->s.startsWith("R")).count());
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Akash");
		names.add("Annai");
		names.add("Akhil");
		names.add("Suresh");
		names.add("Ramesh");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		

	}

}
