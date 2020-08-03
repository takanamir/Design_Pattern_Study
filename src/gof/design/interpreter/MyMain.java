package gof.design.interpreter;

public class MyMain {
	public static void main(String[] args) {
		// 「2 - (3 + 4)」の構文を保持する
		IntOperand op1 = new IntOperand(2);
		Subtraction sub = new Subtraction();
		IntOperand op2 = new IntOperand(3);
		Addition add = new Addition();
		IntOperand op3 = new IntOperand(4);
		Expression subExp = new Expression(op2, add, op3);
		Expression mainExp = new Expression(op1, sub, subExp);

		// 保持した構造に従って「2 - (3 + 4)」を実行
		System.out.println(mainExp.getValue()); // -5
	}
}