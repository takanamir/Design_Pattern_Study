package gof.design.factorymethod;

public abstract class MyClassA {
	abstract String getName();

	abstract int getAge();

	abstract MyClassB createMyClassB();
}