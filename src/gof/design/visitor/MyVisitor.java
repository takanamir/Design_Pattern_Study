package gof.design.visitor;

public class MyVisitor {
	MyClass target;

	public void setTarget(MyClass newTarget) {
		this.target = newTarget;
	}

	public void printProperty() {
		System.out.println(target.getFirstName() + " " + target.getLastName());
	}
}