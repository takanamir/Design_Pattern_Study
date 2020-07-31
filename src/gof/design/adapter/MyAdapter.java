package gof.design.adapter;

public class MyAdapter extends MyPersonBImpl {
	MyPersonA person;

	MyAdapter(MyPersonA person) {
		super(null); // ダミーで呼ぶ
		this.person = person;
	}

	public String getName() {
		return person.getFirstName() + " " + person.getLastName();
	}
}