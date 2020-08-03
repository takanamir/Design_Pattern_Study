package gof.design.memento;

public class MyMemento {
	private int value1;

	private String value2;

	MyMemento(int value1, String value2) {
		this.value1 = value1;
		this.value2 = new String(value2);
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}
}