package genericsClassExample;

public class StoreAnyValueWithGenerics2<Steve> {

	private Steve value;

	public StoreAnyValueWithGenerics2(Steve value) {
		this.value = value;
	}

	public Steve getValue() {
		return value;	
	}

}
