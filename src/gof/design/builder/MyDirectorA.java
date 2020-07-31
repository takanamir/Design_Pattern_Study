package gof.design.builder;

public class MyDirectorA {
	public MyClass createMyClass(MyBuilder builder) {
		builder.addFirstName();
		builder.addMiddleName();
		builder.addLastName();
		return builder.getMyClass();
	}
}