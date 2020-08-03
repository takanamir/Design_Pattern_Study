package gof.design.templatemethod;

public class MySafeImpl extends MySafe {
	@Override
	protected int turnLeft1(int position, int number) {
		return position += number;
	}

	@Override
	protected int turnRight(int position, int number) {
		return position -= number / 2;
	}

	@Override
	protected int turnLeft2(int position, int number) {
		return position += number * 4;
	}
}