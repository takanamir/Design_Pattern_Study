package gof.design.abstractfactory;

// SuzukiさんのPC用のファクトリクラス
public class MyFactory1 extends MyFactory {
	MyClassA createMyClassA() {
		return new MyClassA1();
	}

	MyClassB createMyClassB() {
		return new MyClassB1();
	}
}