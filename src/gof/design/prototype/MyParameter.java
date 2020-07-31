package gof.design.prototype;

public class MyParameter implements Cloneable {
	private int value;

	public MyParameter(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}