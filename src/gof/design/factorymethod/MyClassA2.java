package gof.design.factorymethod;

public class MyClassA2 extends MyClassA {
	@Override
	String getName() {
		return "Tanaka";
	}

	@Override
	int getAge() {
		return 30;
	}

	@Override
	MyClassB createMyClassB() {
		return new MyClassB2();
	}
}