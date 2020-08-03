package gof.design.observer;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	int value = 0;

	List<MyObserver> observers = new ArrayList<MyObserver>();

	public void addObserver(MyObserver observer) {
		observers.add(observer);
	}

	public void doIt() {
		value++;

		// オブザーバーオブジェクト全てに通知
		for(int i = 0; i < observers.size(); i++) {
			MyObserver observer = (MyObserver) observers.get(i);
			observer.done(value);
		}
	}
}