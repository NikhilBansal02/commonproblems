package concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntToInteger {

	public static void main(String[] args) {

		int[] arr = {20,10,4,50,60,2,0,11,13,15,17};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
//		Double d = list.stream()
//		.mapToInt(i->i)
//		.average()
//		.orElse(0);
		
	//	System.out.println(d);
		
		List<String> names = Arrays.asList("nikhil","niks","bansal","bansal","nik","abc");
		
//		names.stream()
//		.filter(s -> s.startsWith("n"))
//		.filter(s ->s.length()>2)
//		.forEach(s ->System.out.println(s));
		
		int a = list.stream()
		.filter(i ->i%2!=0)
		.findAny()
		.orElse(0);
		//System.out.println(a);
		
		Map<String,Long> result = names.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//result.forEach((name, count) ->System.out.println(name +" "+count));
		
		int res = list.stream()
		.reduce(0,Integer::sum);
		//System.out.println("Sum is :"+res);
		
		Map<String,Long> sortedMap = result
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e2,LinkedHashMap::new));
		
		
		sortedMap.forEach((name, count) ->System.out.println(name +" "+count));
	}

}
