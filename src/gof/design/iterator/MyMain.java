package gof.design.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyMain {
	public static void main(String[] args) {
		// 3つの MyClass オブジェクトを作って HashSet に格納
		MyClass myClass1 = new MyClass("My class 1");
		MyClass myClass2 = new MyClass("My class 2");
		MyClass myClass3 = new MyClass("My class 3");

		Set<MyClass> classSet = new HashSet<MyClass>();
		classSet.add(myClass1);
		classSet.add(myClass2);
		classSet.add(myClass3);

		// イテレータオブジェクトを入手して順番に MyClass オブジェクトにアクセス
		Iterator<MyClass> iter = classSet.iterator();
		while(iter.hasNext()) {
			MyClass next = (MyClass) iter.next();
			System.out.println(next.getName());
		}
	}
}