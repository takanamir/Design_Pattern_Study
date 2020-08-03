package gof.design.memento;

import java.util.ArrayList;
import java.util.List;

public class MyCareTaker {
	List<MyMemento> mememtoPool = new ArrayList<MyMemento>();

	public void add(MyMemento memento) {
		mememtoPool.add(memento);
	}


	public MyMemento get(int when) {
		return (MyMemento) mememtoPool.get(mememtoPool.size() + when - 1);
	}
}