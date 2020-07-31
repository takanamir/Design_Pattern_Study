package gof.design.builder;

public class MyMain {
	public static void main(String[] args) {
		MyBuilder builder = new MyBuilder();

		// フルネームを持つ MyClass オブジェクトを作る
		MyDirectorA dirA = new MyDirectorA();
		MyClass myClass1 = dirA.createMyClass(builder);

		// ミドルネームを持たない MyClass オブジェクトを作る
		MyDirectorB dirB = new MyDirectorB();
		MyClass myClass2 = dirB.createMyClass(builder);

		System.out.println(myClass1.getName());
		System.out.println(myClass2.getName());
	}
}