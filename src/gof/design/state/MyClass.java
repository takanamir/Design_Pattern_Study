package gof.design.state;

public class MyClass {
	private MyState currentState;

	public MyClass(MyState initialState) {
		this.currentState = initialState;
	}

	public void setState(MyState nextState) {
		this.currentState = nextState;
	}

	public void doIt() {
		// この瞬間のステートオブジェクトのメソッドを呼ぶ
		System.out.println("Currente state : " + currentState.getName());
		currentState.printMessage();
	}
}