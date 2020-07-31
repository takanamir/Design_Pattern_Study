package gof.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MyPool {
	Map pool = new HashMap<>();

	public void putEmployee(MyEmployee employee) {
		pool.put(employee.unit, employee);
	}

	MyEmployee getEmployee(String unit, String name) {
		MyEmployee result = (MyEmployee) pool.get(unit);
		if(result == null) {
			// まだunit用の共有オブジェクトを作っていなければ新しく作ってHashMapに追加
			result = new MyEmployee(unit);
			pool.put(unit, result);
		}

		// 共有オブジェクトのname変数を書き換えてから返す
		result.name = name;
		return result;
	}
}