package gof.design.bridge;

public class MyClassBExt extends MyClassB {
	@Override
	public String getPlatform() {
		return "OS/B (version 1.2)";
	}

	@Override
	public String getVendor() {
		return "Microsoft (San Hose, CA xxxxx)";
	}
}