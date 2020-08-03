package gof.design.interpreter;

/**
 * 減算を表すクラス
 * @author takam
 *
 */
public class Subtraction implements Operator {
	private Operand operand1;
	private Operand operand2;

	public Operand getOperand1() {
		return operand1;
	}

	public void setOperand1(Operand operand1) {
		this.operand1 = operand1;
	}

	public Operand getOperand2() {
		return operand2;
	}

	public void setOperand2(Operand operand2) {
		this.operand2 = operand2;
	}

	@Override
	public int calc() {
		return operand1.getValue() - operand2.getValue();
	}
}