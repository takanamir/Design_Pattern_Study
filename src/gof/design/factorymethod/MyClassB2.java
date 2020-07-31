package gof.design.factorymethod;

public class MyClassB2 extends MyClassB {
	@Override
	String getAddress() {
		return "Tokyo";
	}

	@Override
	int getFloor() {
		return 2;
	}
}