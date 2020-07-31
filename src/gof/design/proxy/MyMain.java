package gof.design.proxy;

public class MyMain {
	public static void main(String[] args) {
		MyClassImpl1 imp1 = new MyClassImpl1();
		MyProxy proxy = new MyProxy(imp1);
		doItLoop(imp1);
		System.out.println();
		doItLoop(proxy);
	}

	private static void doItLoop(MyClass myClass) {
		for(int i = 0; i < 10; i++) {
			myClass.doIt();
		}
	}
}