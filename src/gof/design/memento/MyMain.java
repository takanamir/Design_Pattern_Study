package gof.design.memento;

public class MyMain {
	public static void main(String[] args) {
		MyCareTaker careTaker = new MyCareTaker();
		MyClass myClass = new MyClass();

		// MyClass オブジェクトの状態を3回変える
		myClass.doIt();
		careTaker.add(myClass.createMemento());
		System.out.println(myClass.getValue1() + "." + myClass.getValue2());

		myClass.doIt();
		careTaker.add(myClass.createMemento());
		System.out.println(myClass.getValue1() + "." + myClass.getValue2());

		myClass.doIt();
		careTaker.add(myClass.createMemento());
		System.out.println(myClass.getValue1() + "." + myClass.getValue2());

		// 2回前の状態を復元
		myClass.setMemento(careTaker.get(-2));
		System.out.println(myClass.getValue1() + "." + myClass.getValue2());
	}
}