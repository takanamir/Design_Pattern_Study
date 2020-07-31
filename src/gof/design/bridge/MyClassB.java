package gof.design.bridge;

public class MyClassB {
	static MyClassB createInstance(boolean isDescriptive) {
		if(isDescriptive) {
			return new MyClassBExt();
		} else {
			return new MyClassB();
		}
	}

	public String getName() {
		return "MyClass";
	}

	public String getPlatform() {
		return "OS/B";
	}

	public String getVendor() {
		return "Microsoft";
	}
}