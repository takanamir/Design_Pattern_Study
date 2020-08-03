package gof.design.mediator;

public class MyClass {
	private String name;

	public MyClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void memberAdded(String name) {
		// 新しいメンバーが自分以外に加わるとこのメソッドが呼ばれる
		System.out.println(this.name + " : Welcome, " + name);
	}
}