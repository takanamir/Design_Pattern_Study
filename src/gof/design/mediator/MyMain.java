package gof.design.mediator;

public class MyMain {
	public static void main(String[] args) {
		// 3つの MyClass オブジェクトを作って順番に追加
		// 後から追加されたオブジェクトのことが、
		// 先に追加されたオブジェクトに通知される
		MyManager manager = new MyManager();
		MyClass myClass1 = new MyClass("Suzuki");
		MyClass myClass2 = new MyClass("Tanaka");
		MyClass myClass3 = new MyClass("Yamamoto");
		MyClass myClass4 = new MyClass("Sato");

		manager.add(myClass1);
		manager.add(myClass2);
		manager.add(myClass3);
		manager.add(myClass4);
	}
}