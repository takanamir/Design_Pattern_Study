package gof.design.templatemethod;

public abstract class MySafe {
	public boolean open(int position, int key1, int key2, int key3) {
		int result;
		result = turnLeft1(position, key1);
		result = turnRight(result, key2);
		result = turnLeft2(result, key3);

		if(result == position) {
			return true;
		} else {
			return false;
		}
	}

	protected abstract int turnLeft1(int position, int number);

	protected abstract int turnRight(int position, int number);

	protected abstract int turnLeft2(int position, int number);
}