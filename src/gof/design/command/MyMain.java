package gof.design.command;

public class MyMain {
	public static void main(String[] args) {
		MyService service = new MyService();

		// ServiceA と ServiceB を実行するためのコマンドオブジェクトを生成して
		// MyService に渡す
		MyRequest request1 = new MyRequest1();
		service.putRequest(request1);

		System.out.println();

		// ServiceC と ServiceA を実行するためのコマンドオブジェクトを生成して
		// MyService に渡す
		MyRequest request2 = new MyRequest2();
		service.putRequest(request2);
	}
}