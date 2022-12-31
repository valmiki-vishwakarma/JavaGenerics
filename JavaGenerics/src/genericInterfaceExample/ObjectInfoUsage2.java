package genericInterfaceExample;

public class ObjectInfoUsage2<T>  implements ObjectInfo<T>{

	@Override
	public T getObjectInfo(T val) {
		return val;
	}

	public static void main(String[] args) {
		ObjectInfoUsage2<Integer> o1=new ObjectInfoUsage2<>();
		System.out.println(o1.getObjectInfo(100));
		
		ObjectInfoUsage2<Double> o2=new ObjectInfoUsage2<>();
		System.out.println(o2.getObjectInfo(100.333));
		
		
	}
}
