package gof.design.abstractfactory;

public abstract class MyClassA {
	abstract String getName();

	abstract int getAge();

	abstract MyClassB createMyClassB();
}