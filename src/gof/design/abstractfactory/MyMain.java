package gof.design.abstractfactory;

public class MyMain {
	public static void main(String[] args) {
		// ファクトリメソッドを呼び出す
		MyFactory factory = MyFactory.getFactory(args[0]);

		MyClassA classA = factory.createMyClassA();
		MyClassB classB = factory.createMyClassB();

		// 入手したのが MyClassA1 なのか MyClassA2 なのか知らないまま使う
		System.out.println(classA.getName());
		System.out.println(classA.getAge());

		// 入手したのが MyClassB1 なのか MyClassB2 なのか知らないまま使う
		System.out.println(classB.getVendor());
		System.out.println(classB.getDate());
	}
}