package gof.design.c_o_responsibility;

public class MyHandlerA {
	MyHandlerB next;

	public MyHandlerA() {
		next = new MyHandlerB();
	}

	public void doIt(int param) {
		if(param > 0) {
			System.out.println("Do it by MyHandlerA");
		}

		// MyHandlerB にリクエストを転送
		next.doIt(param);
	}
}