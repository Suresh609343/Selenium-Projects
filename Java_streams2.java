package JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Java_streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Stream.of("Abhijeeth","Akhil","Ram","Amar","Akash").filter(s->s.startsWith("A")).count());
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Akash");
		names.add("Annai");
		names.add("Akhil");
		names.add("Suresh");
		names.add("Ramesh");
		
		long d = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(d);
		
		//for getting all the names from the names stream.
		//names.stream().filter(s->s.length()<=5).forEach(s->System.out.println(s));
		
		//for getting only one element from the intermediate op to the next operation
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	}

}
