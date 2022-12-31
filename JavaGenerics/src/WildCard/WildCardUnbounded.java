package WildCard;

import java.util.Arrays;
import java.util.List;

public class WildCardUnbounded {

	//? - Wild card character - here Type is unknown
	public static <T> void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	public static <T> void printList(List<T> list,T item) {
//		list.add(item);
//		list.add(1);
		list.add(null);
		for(Object  obj:list) {
			System.out.println(obj);
		}
	}
	
	
	public static void main(String[] args) {
		List<Object> list = Arrays.asList(1, 3, "steve", true);
		System.out.println(list);
		printList(list);

		List<Integer> list2 = Arrays.asList(1, 2, 4, 5, 6, 8);
		printList(list2);
	}
}
