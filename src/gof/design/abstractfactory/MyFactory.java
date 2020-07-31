package gof.design.abstractfactory;

public abstract class MyFactory {
	abstract MyClassA createMyClassA();

	abstract MyClassB createMyClassB();

	// PCの所有者をチェックして、必要なファクトリオブジェクトを返す
	static MyFactory getFactory(String owner) {
		if (owner.equals("Suzuki")) {
			return new MyFactory1();
		} else if (owner.equals("Tanaka")) {
			return new MyFactory2();
		} else {
			return null;
		}
	}
}