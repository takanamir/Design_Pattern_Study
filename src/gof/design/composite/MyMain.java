package gof.design.composite;

public class MyMain {
	public static void main(String[] args) {
		// サンプルの階層構造を作る
		MyComposite comp0 = new MyComposite("root");
		MyComposite comp1 = new MyComposite("comp1");
		MyComposite comp2 = new MyComposite("comp2");
		MyComposite comp3 = new MyComposite("comp3");

		comp0.addComposite(comp1);
		comp1.addComposite(comp2);
		comp2.addComposite(comp3);

		// 最後に葉を1つ加える
		MyLeaf leaf = new MyLeaf("leaf");
		comp3.addLeaf(leaf);

		// 先頭の枝から全ての名前を出力
		view(comp0);

		System.out.println();

		// 葉の名前だけを出力
		view(leaf);
	}

	private static void view(Object target) {
		if(target instanceof MyComposite) {
			// 引数が枝のときはその名前を再帰的に出力
			((MyComposite) target).viewNames();
		} else if(target instanceof MyLeaf) {
			// 引数が葉のときは葉の名前だけを出力
			((MyLeaf) target).viewName();
		}
	}
}