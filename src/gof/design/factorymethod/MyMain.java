package gof.design.factorymethod;

public class MyMain {
	public static void main(String[] args) {
		MyClassA classA = new MyClassA2();

		// ファクトリメソッドを呼び出す
		MyClassB classB = classA.createMyClassB();

		// 入手したのが MyClassB1 なのか MyClassB2 なのか知らないまま使う
		System.out.println(classA.getName());
		System.out.println(classA.getAge());
		System.out.println(classB.getAddress());
		System.out.println(classB.getFloor());
	}
}