package gof.design.adapter;

public class MyMain {
	public static void main(String[] args) {
		MyPersonA person = new MyPersonA("Taro", "Suzuki");
		MyAdapter adapter = new MyAdapter(person);

		MyNameViewer viewer = new MyNameViewer();
		viewer.viewName(adapter);
	}
}