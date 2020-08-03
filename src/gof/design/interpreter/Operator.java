package gof.design.interpreter;

public interface Operator {
	// 左側のオペランドをセット
	public void setOperand1(Operand operand);

	// 右側のオペランドをセット
	public void setOperand2(Operand operand);

	// 左右のオペランドを使って演算を実行し、その結果を返す
	public int calc();
}