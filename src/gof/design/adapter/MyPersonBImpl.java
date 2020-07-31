package gof.design.adapter;

public class MyPersonBImpl implements MyPersonB {
	private String name;

	public MyPersonBImpl(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}