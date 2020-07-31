package gof.design.proxy;

public class MyClassImpl1 implements MyClass {
	@Override
	public String doIt(int count) {
		String result = "Do it!!";
		return result;
	}
}