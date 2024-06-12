package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class streamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print names that ends with letter "a" in Upperacse
		//Stream.of("Abhijeeth","Akhila","Rama","Amar","Akashith").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print all the names in uppercase
		//Stream.of("Amar","al","flme","vkdn","vijvv").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print all names which start with a in order.
		//Stream.of("Aiodh","Afeonhc","dcdcev","Acjos","Aclfhcf","dwnk").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merging two different arrays into one Stream & printing them sorted
		List<String> names1 = Arrays.asList("Abheejth","AKhil","Kalyan","Annai");
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Akash");
		names.add("Annai");
		names.add("Akhila");
		names.add("Suresh");
		names.add("Ramesh");
		
		Stream<String> mergedStream = Stream.concat(names1.stream(), names.stream());
		
		mergedStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag = mergedStream.anyMatch(s->s.equalsIgnoreCase("annai"));
		Assert.assertTrue(flag);
		
	}

}
