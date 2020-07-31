package gof.design.facade;

public class MyMain {
	public static void main(String[] args) {
		String name;

		// ファサードクラスを使わない場合
		MyClassA classA = new MyClassA();
		MyClassB classB = new MyClassB();
		String isbn = classA.getIsbnNumber();
		name = classB.getBookName(isbn);
		System.out.println(name);

		// ファサードクラスを使う場合
		MyClassC classC = new MyClassC();
		name = classC.getBookName();
		System.out.println(name);
	}
}