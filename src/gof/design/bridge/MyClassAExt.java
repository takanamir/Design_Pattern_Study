package gof.design.bridge;

public class MyClassAExt extends MyClassA {
	MyClassAExt(boolean isDescriptive) {
		super(isDescriptive);
	}

	@Override
	public String getName() {
		return "MyClassA(Extended)";
	}
}