package gof.design.interpreter;

public interface Operand {
	// 左右のオペランドを使って演算を実行し、その結果を返す
	public int getValue();
}