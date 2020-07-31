package gof.design.abstractfactory;

// TanakaさんのPC用のファクトリクラス
public class MyFactory2 extends MyFactory {
	MyClassA createMyClassA() {
		return new MyClassA2();
	}

	MyClassB createMyClassB() {
		return new MyClassB2();
	}
}