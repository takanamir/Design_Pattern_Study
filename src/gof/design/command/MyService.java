package gof.design.command;

public class MyService {
	public void putRequest(MyRequest request) {
		// コマンドオブジェクトに MyService をセット
		request.setService(this);

		// コマンドオブジェクトにリクエストの実行
		// MyService呼び出しを支持
		request.procRequest();
	}

	public void serviceA() {
		System.out.println("Service A");
	}

	public void serviceB() {
		System.out.println("Service B");
	}

	public void serviceC() {
		System.out.println("Service C");
	}
}