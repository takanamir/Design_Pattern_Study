package gof.design.interpreter;

/**
 * 整数のオペランドを表すクラス
 * @author takam
 *
 */
public class IntOperand implements Operand {
	private int value;

	public IntOperand(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return value;
	}
}