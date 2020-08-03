package gof.design.observer;

public class MyObserverB implements MyObserver {
	@Override
	public void done(int updatedValue) {
		System.out.println("MyObserverB : Updated : " + updatedValue);
	}
}