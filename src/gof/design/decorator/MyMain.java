package gof.design.decorator;

public class MyMain {
	public static void main(String[] args) {
		// 拡張前の MyClassImpl1
		MyClassImpl1 myClass1 = new MyClassImpl1();
		printName(myClass1); // Suzuki

		// 拡張前の MyClassImpl2
		MyClassImpl2 myClass2 = new MyClassImpl2();
		printName(myClass2); // Tanaka

		// MyDecorator によって拡張後のオブジェクトを使う
		MyDecorator myDec1 = new MyDecorator(myClass1);
		printName(myDec1); // ☆Suzuki☆
		MyDecorator myDec2 = new MyDecorator(myClass2);
		printName(myDec2); // ☆Tanaka☆

		// MyDecorator によって MyDecorator 自身を拡張
		MyDecorator myDec3 = new MyDecorator(myDec1);
		printName(myDec3); // ☆☆Suzuki☆☆
	}

	private static void printName(MyClass myClass) {
		System.out.println(myClass.getName());
	}
}