package genericsClassExample;

import java.util.ArrayList;
import java.util.List;

public class StoreValue {

	public static void main(String[] args) {
		/*
		StoreIntegerValue store = new StoreIntegerValue(100);
		Integer value = store.getValue();
		System.out.println(value);
		
		//Double value
		StoreDoubleValue sd=new StoreDoubleValue(100.239);
		Double value2 = sd.getValue();
		System.out.println(value2);
		System.out.println("=============================");
		
		//Using Object 1
		StoreAnyValue any=new StoreAnyValue(129.2383);
		Object anyVal=	any.getValue();
		System.out.println(anyVal);
		
		
		//Using Object 2
		StoreAnyValue any2=new StoreAnyValue(129);
		Object anyVal2=	any2.getValue();
		System.out.println(anyVal2);
		
		//Using Object 3 - String value
		StoreAnyValue any3=new StoreAnyValue("Steve");
		Object val3=any3.getValue();
		System.out.println(val3);
		
		//Using Object 3 - ArrayList value
		List<String> ls =new ArrayList<String>();
		ls.add("Steve");
		ls.add("Bill Gates");
		ls.add("Mark");
		StoreAnyValue any4=new StoreAnyValue(ls);
		Object val4=any4.getValue();
		System.out.println(val4);
		*/
		
		//StoreAnyValueWithGenerics
		StoreAnyValueWithGenerics<Integer> s1= new StoreAnyValueWithGenerics<Integer>(1000);
		Integer v1=s1.getValue();
		System.out.println(v1);
	
		//Double
		StoreAnyValueWithGenerics<Double> s2=new StoreAnyValueWithGenerics<Double>(100.2332);
		Double d=s2.getValue();
		System.out.println(d);
		
		//String 
		StoreAnyValueWithGenerics<String> s3=new StoreAnyValueWithGenerics<String>("Steve");
		String val3=s3.getValue();
		System.out.println(val3);
		
		
		
		
	}
	
}
