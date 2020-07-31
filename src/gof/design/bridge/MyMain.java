package gof.design.bridge;

public class MyMain {
	public static void main(String[] args) {
		MyClassA classA;

		// MyClassA と MyClassB を組み合わせる
		classA = new MyClassA(false);
		System.out.println(classA.getName());
		System.out.println(classA.getPlatform());
		System.out.println(classA.getVendor());

		System.out.println();

		// MyClassA と MyClassBExt を組み合わせる
		classA = new MyClassA(true);
		System.out.println(classA.getName());
		System.out.println(classA.getPlatform());
		System.out.println(classA.getVendor());

		System.out.println();

		// MyClassAExt と MyClassB を組み合わせる
		classA = new MyClassAExt(false);
		System.out.println(classA.getName());
		System.out.println(classA.getPlatform());
		System.out.println(classA.getVendor());

		System.out.println();

		// MyClassAExt と MyClassBExt を組み合わせる
		classA = new MyClassAExt(true);
		System.out.println(classA.getName());
		System.out.println(classA.getPlatform());
		System.out.println(classA.getVendor());
	}
}