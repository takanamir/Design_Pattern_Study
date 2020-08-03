package gof.design.interpreter;

/**
 * 演算式(部分的なものを含む)を表すクラス
 * @author takam
 *
 */
public class Expression implements Operand {
	private Operand operand1;
	private Operator operator;
	private Operand operand2;

	public Expression(Operand operand1, Operator operator, Operand operand2) {
		this.operand1 = operand1;
		this.operator = operator;
		this.operand2 = operand2;

		operator.setOperand1(operand1);
		operator.setOperand2(operand2);
	}

	@Override
	public int getValue() {
		return operator.calc();
	}
}