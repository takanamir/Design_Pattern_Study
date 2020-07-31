package gof.design.facade;

public class MyClassC {
	public String getBookName() {
		MyClassA classA = new MyClassA();
		MyClassB classB = new MyClassB();
		String isbn = classA.getIsbnNumber();
		return classB.getBookName(isbn);
	}
}