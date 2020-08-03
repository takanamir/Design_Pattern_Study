package gof.design.command;

public class MyRequest1 extends MyRequest {
	public void procRequest() {
		service.serviceA();
		service.serviceB();
	}
}