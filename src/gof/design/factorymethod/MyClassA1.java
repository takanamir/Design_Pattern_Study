package gof.design.factorymethod;

public class MyClassA1 extends MyClassA {
	@Override
	String getName() {
		return "Suzuki";
	}

	@Override
	int getAge() {
		return 20;
	}

	@Override
	MyClassB createMyClassB() {
		return new MyClassB1();
	}
}