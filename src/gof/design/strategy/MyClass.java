package gof.design.strategy;

public class MyClass {
	private MyStrategy currentStrategy;

	public MyClass(MyStrategy initialStrategy) {
		this.currentStrategy = initialStrategy;
	}

	public void changeStrategy(MyStrategy newStrategy) {
		this.currentStrategy = newStrategy;
	}

	public void getOpinion(int point) {
		// この瞬間のストラテジに点数の評価をリクエスト
		int result = currentStrategy.check(point);

		if(result > 0) {
			System.out.println(point + " : Good!!");
		} else if(result == 0) {
			System.out.println(point + " : So so.");
		} else {
			System.out.println(point + " : Bad...");
		}
	}
}