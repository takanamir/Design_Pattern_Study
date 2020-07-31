package gof.design.factorymethod;

public class MyClassB1 extends MyClassB {
	@Override
	String getAddress() {
		return "Yokohama";
	}

	@Override
	int getFloor() {
		return 3;
	}
}