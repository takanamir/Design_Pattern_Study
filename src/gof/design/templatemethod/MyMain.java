package gof.design.templatemethod;

public class MyMain {
	public static void main(String[] args) {
		MySafeImpl safe = new MySafeImpl();
		if(safe.open(2, 2, 12, 1)) {
			System.out.println("Succeed!!");
		} else {
			System.out.println("Failed!!");
		}
	}
}