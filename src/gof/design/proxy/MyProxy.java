package gof.design.proxy;

public class MyProxy implements MyClass {
	MyClass myClass;
	boolean flag = true;

	public MyProxy(MyClass myClass) {
		this.myClass = myClass;
	}

	@Override
	public String doIt(int count) {
		String result = null;
		if (flag) {
			result = myClass.doIt(count);
		}
		flag = !flag;

		return result;
	}
}