package gof.design.c_o_responsibility;

public class MyMain {
	public static void main(String[] args) {
		MyHandlerA handlerA = new MyHandlerA();

		handlerA.doIt(1);
		System.out.println();
		handlerA.doIt(2);
		System.out.println();
		handlerA.doIt(100);
	}
}