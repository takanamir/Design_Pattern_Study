package gof.design.proxy;

public class MyProxy implements MyClass {
	MyClass myClass;
	boolean flag = true;

	public MyProxy(MyClass myClass) {
		this.myClass = myClass;
	}

	@Override
	public void doIt() {
		if (flag) {
			myClass.doIt();
		}
		flag = !flag;
	}
}