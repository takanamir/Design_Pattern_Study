package gof.design.singleton;

public class MyMain {
	public static void main(String[] args) {
		System.out.println("Start");

		MyClass myClass1 = MyClass.getInstance();
		MyClass myClass2 = MyClass.getInstance();

		if(myClass1 == myClass2) {
			System.out.println("myClass1とmyClass2は同じインスタンス");
		} else {
			System.out.println("myClass1とmyClass2は同じインスタンスではない");
		}

		System.out.println("End");
	}
}