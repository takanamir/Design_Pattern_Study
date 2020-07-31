package gof.design.composite;

public class MyComposite {
	private String name;
	MyComposite childComposite = null;
	MyLeaf childMyLeaf = null;

	MyComposite(String name) {
		this.name = name;
	}

	public void addComposite(MyComposite childComposite) {
		this.childComposite = childComposite;
	}

	public void addLeaf(MyLeaf childMyLeaf) {
		this.childMyLeaf = childMyLeaf;
	}

	public void viewNames() {
		System.out.println(name);

		if(childComposite != null) {
			// 子供の枝があればその名前を再帰的に出力
			childComposite.viewNames();
		} else if(childMyLeaf != null) {
			// 子供が葉のときはその名前だけを出力
			childMyLeaf.viewName();
		}
	}
}