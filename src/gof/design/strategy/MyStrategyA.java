package gof.design.strategy;

public class MyStrategyA implements MyStrategy {
	@Override
	public int check(int point) {
		if(point > 90) {
			return 1;
		} else {
			return -1;
		}
	}
}