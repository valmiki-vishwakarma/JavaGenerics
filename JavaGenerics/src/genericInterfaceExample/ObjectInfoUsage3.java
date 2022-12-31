package genericInterfaceExample;

public class ObjectInfoUsage3 implements ObjectInfo{
//ObjectInfo is a raw type. References to generic type ObjectInfo<T> 
//should be parameterized

	@Override
	public Object getObjectInfo(Object val) {
		return val;
	}
	

	public static void main(String[] args) {
		ObjectInfoUsage3 o1=new ObjectInfoUsage3();
		Integer val=(Integer)o1.getObjectInfo(10000);
		System.out.println(val);
	}

	
}
