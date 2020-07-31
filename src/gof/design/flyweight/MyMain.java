package gof.design.flyweight;

public class MyMain {
	public static void main(String[] args) {
		MyPool pool = new MyPool();

		// 社員オブジェクトを部署ごとに作ってプールする
		MyEmployee emp1 = new MyEmployee("人事");
		MyEmployee emp2 = new MyEmployee("総務");
		MyEmployee emp3 = new MyEmployee("経理");
		pool.putEmployee(emp1);
		pool.putEmployee(emp2);
		pool.putEmployee(emp3);

		// 個々のオブジェクトを取り出して使う
		MyEmployee empA = pool.getEmployee("総務", "Suzuki");
		printEmployee(empA);
		MyEmployee empB = pool.getEmployee("総務", "Tanaka");
		printEmployee(empB);
		MyEmployee empC = pool.getEmployee("総務", "Satou");
		printEmployee(empC);
		MyEmployee empD = pool.getEmployee("経理", "Suzuki");
		printEmployee(empD);
		MyEmployee empE = pool.getEmployee("経理", "Nakamura");
		printEmployee(empE);
		MyEmployee empF = pool.getEmployee("経理", "Takahashi");
		printEmployee(empF);
	}

	private static void printEmployee(MyEmployee emp) {
		System.out.println(emp.name + " : " + emp.unit);
	}
}