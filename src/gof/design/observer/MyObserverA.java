package gof.design.observer;

public class MyObserverA implements MyObserver {
	@Override
	public void done(int updatedValue) {
		System.out.println("MyObserverA : Updated : " + updatedValue);
	}
}