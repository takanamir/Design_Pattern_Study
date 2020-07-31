package gof.design.decorator;

public class MyDecorator implements MyClass {
	MyClass target;

	MyDecorator(MyClass target) {
		this.target = target;
	}

	public String getName() {
		String result = "☆";
		result += target.getName();
		result += "☆";
		return result;
	}
}