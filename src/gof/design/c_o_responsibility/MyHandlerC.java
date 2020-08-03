package gof.design.c_o_responsibility;

public class MyHandlerC {
	public void doIt(int param) {
		if (param < 100) {
			System.out.println("Do it by MyHandlerC");
		}
	}
}