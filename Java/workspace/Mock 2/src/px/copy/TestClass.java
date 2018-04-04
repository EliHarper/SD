package px.copy;

import p1.Movable;
import p2.Donkey;

public class TestClass {
	public static void main(String[] args) {
		Movable m = new Donkey();
		m.move(10);
		m.moveBack(20);
		System.out.println(m.location);
	}
}