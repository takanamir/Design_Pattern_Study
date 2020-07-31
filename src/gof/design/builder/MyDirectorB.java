package gof.design.builder;

public class MyDirectorB {
	public MyClass createMyClass(MyBuilder builder) {
		builder.addFirstName();
		builder.addLastName();
		return builder.getMyClass();
	}
}