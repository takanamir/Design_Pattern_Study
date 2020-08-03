package gof.design.command;

public class MyRequest2 extends MyRequest {
	public void procRequest() {
		service.serviceC();
		service.serviceA();
	}
}