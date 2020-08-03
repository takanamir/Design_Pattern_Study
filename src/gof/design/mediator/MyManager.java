package gof.design.mediator;

import java.util.ArrayList;
import java.util.List;

public class MyManager {
	// メンバーオブジェクトを保持
	List<MyClass> members = new ArrayList<MyClass>();

	public void add(MyClass newMember) {
		for(int i = 0; i < members.size(); i++) {
			// 旧メンバーの1つ1つに新メンバーの追加を通知
			MyClass oldMyMember = (MyClass) members.get(i);
			oldMyMember.memberAdded(newMember.getName());
		}
		members.add(newMember);
	}
}