package gof.design.visitor;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
	public static void main(String[] args) {
		List<MyClass> pool = new ArrayList<MyClass>();
		pool.add(new MyClass("Taro", "Suzuki"));
		pool.add(new MyClass("Jiro", "Tanaka"));
		pool.add(new MyClass("Saburo", "Yamamoto"));

		MyVisitor visitor = new MyVisitor();
		for(int i = 0; i < pool.size(); i++) {
			MyClass myClass = (MyClass) pool.get(i);
			myClass.visit(visitor);
		}
	}
}