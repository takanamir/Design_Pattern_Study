package gof.design.bridge;

public class MyClassA {
	private MyClassB classB;

	public MyClassA(boolean isDescriptive) {
		// MyClassB 側のクラスの選択はファクトリメソッドに任せる
		classB = MyClassB.createInstance(isDescriptive);
	}

	public String getName() {
		return "MyClassA";
	}

	public String getPlatform() {
		return classB.getPlatform();
	}

	public String getVendor() {
		return classB.getVendor();
	}
}