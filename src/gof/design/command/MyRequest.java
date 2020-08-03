package gof.design.command;

public abstract class MyRequest {
	MyService service;

	public void setService(MyService service) {
		this.service = service;
	}

	public abstract void procRequest();
}