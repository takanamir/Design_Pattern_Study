package gof.design.strategy;

public class MyStrategyB implements MyStrategy {
	@Override
	public int check(int point) {
		if(point > 50) {
			return 1;
		} else if(point > 30) {
			return 0;
		} else {
			return -1;
		}
	}
}