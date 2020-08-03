package gof.design.state;

public class MyMain {
	public static void main(String[] args) {
		// 3種類のステートメントオブジェクトを作っておいて、切り替え
		MyState initialState = new MyState("State1", "Message 1");
		MyState secondState = new MyState("State2", "Message 2");
		MyState thirdState = new MyState("State3", "Message 3");

		MyClass myClass = new MyClass(initialState);
		myClass.doIt();
		myClass.setState(secondState);
		myClass.doIt();
		myClass.setState(thirdState);
		myClass.doIt();
	}
}