import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sapi {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(01,10,15,8,49,25,98,32,10,49,15);
		Set<Integer> set = new HashSet();
		list.stream().filter(x->x%2==0).forEach(e->System.out.print(e));
		System.out.println();
		System.out.println();
		list.stream().filter(x->String.valueOf(x).startsWith("1")).forEach(x->System.out.print(x+", "));
		System.out.println();
		System.out.println();
		list.stream().map(s->s+"")//converting Integer to String
		.filter(s->s.startsWith("1"))
		.forEach(x->System.out.print(x+" "));
		System.out.println();
		System.out.println();
		list.stream().filter(a->!set.add(a)).forEach(System.out::print);
		System.out.println();
		System.out.println();
		list.stream().findFirst().ifPresent(System.out::println);
		System.out.println();
		System.out.println();
		long count = list.stream().count();
		System.out.println(count);
		System.out.println();
		System.out.println();
		int a = list.stream().max(Integer::compare).get();
		System.out.println("Max: "+a);

	}

}
