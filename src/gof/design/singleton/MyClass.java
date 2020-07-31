package gof.design.singleton;

public class MyClass {
	static MyClass uniqueInstance;

	private MyClass() {
		System.out.println("インスタンスを生成しました");
	}

	static MyClass getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new MyClass();
		}
		return uniqueInstance;
	}
}