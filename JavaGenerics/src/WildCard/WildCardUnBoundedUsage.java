package WildCard;

import java.util.Arrays;
import java.util.List;

public class WildCardUnBoundedUsage<T> {

	T val;
	
	public T returnValue(T val) {
		val=val;
		return val;
	}
	
	public void printList(List<?> list) {
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		
		WildCardUnBoundedUsage<Integer>w1=new WildCardUnBoundedUsage<>();
		int a=w1.returnValue(1000);
		System.out.println(a);
		
		List<String> list1=Arrays.asList("steve","simon");
		w1.printList(list1);
		}
	
}
