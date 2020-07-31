package gof.design.composite;

public class MyLeaf {
	private String name;

	public MyLeaf(String name) {
		this.name = name;
	}

	public void viewName() {
		System.out.println(name);
	}
}