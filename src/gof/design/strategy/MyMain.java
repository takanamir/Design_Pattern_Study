package gof.design.strategy;

public class MyMain {
	public static void main(String[] args) {
		// MyStrategyA での評価
		MyClass myClass = new MyClass(new MyStrategyA());
		myClass.getOpinion(100);
		myClass.getOpinion(40);

		System.out.println();

		// MyStrategyB での評価
		myClass.changeStrategy(new MyStrategyB());
		myClass.getOpinion(100);
		myClass.getOpinion(40);
	}
}