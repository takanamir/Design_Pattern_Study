package gof.design.memento;

public class MyClass {
	private int value1 = 0;

	private String value2 = "";

	public void doIt() {
		value1++;
		value2 += "☆";
	}

	public MyMemento createMemento() {
		return new MyMemento(value1, value2);
	}

	public void setMemento(MyMemento memento) {
		this.value1 = memento.getValue1();
		this.value2 = new String(memento.getValue2());
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