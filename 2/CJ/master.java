package CJ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class master {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10);
		List<String> list1 = Arrays.asList("dfd","Arerewffd","erewffd","Arerewffd","rewffd","Arerewffd");
		
		list1 = list1.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(list1);
		
		Double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(average);
		
		int evenSum = list.stream().filter((e)->e%2==0).mapToInt(Integer::intValue).sum();
		int oddSum = list.stream().filter((e)->e%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println("evenSum: "+evenSum);
		System.out.println("oddSum: "+oddSum);
		
		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		long countStartWith = list1.stream().filter((e)->e.startsWith(String.valueOf('A'))).count();
		System.out.println("countStartWith: "+countStartWith);
		
		list1 = list1.stream().sorted().collect(Collectors.toList());
		System.out.println("ASC:"+list1);
		list1 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("ASC:"+list1);
		
		list1.forEach(e->System.out.println(e));
		

	}

}
