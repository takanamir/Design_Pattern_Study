package gof.design.observer;

public class MyMain {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyObserver observerA = new MyObserverA();
		MyObserver observerB = new MyObserverB();

		myClass.addObserver(observerA);
		myClass.addObserver(observerB);

		myClass.doIt();
		myClass.doIt();
		myClass.doIt();
	}
}