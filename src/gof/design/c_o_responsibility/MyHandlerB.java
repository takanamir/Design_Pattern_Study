package gof.design.c_o_responsibility;

public class MyHandlerB {
	MyHandlerC next;

	public MyHandlerB() {
		next = new MyHandlerC();
	}

	public void doIt(int param) {
		if (param % 2 == 0) {
			System.out.println("Do it by MyHandlerB");
		}

		// MyHandlerC にリクエストを転送
		next.doIt(param);
	}
}