package gof.design.builder;

public class MyBuilder {
	private String name = "";

	public void addFirstName() {
		name += "Tarou";
	}

	public void addMiddleName() {
		name += "Steve";
	}

	public void addLastName() {
		name += "Tanaka";
	}

	public MyClass getMyClass() {
		MyClass result = new MyClass(name);
		name = "";
		return result;
	}
}