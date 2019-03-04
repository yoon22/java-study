package oop.generic;


public class TypeGeneric<T>  {
	
	private Object o;
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Object get0() {
		return o;
	}
	
	public void set0(Object o) {
		this.o = o;
	}
	
	public static void main(String []  args) {
		TypeGeneric<Integer> tg = new TypeGeneric<>();
		tg.setT(123);
		Integer i = tg.getT();
		tg.set0("abc");
		Object o = tg.get0();
	}
	
}
