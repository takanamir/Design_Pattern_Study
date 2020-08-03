package gof.design.visitor;

public class MyClass {
	private String firstName;
	private String lastName;

	public MyClass(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void visit(MyVisitor visitor) {
		// ビジターと相互参照させてメソッドを実行
		visitor.setTarget(this);
		visitor.printProperty();
	}
}