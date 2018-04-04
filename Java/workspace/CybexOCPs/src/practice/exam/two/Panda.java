package practice.exam.two;

import java.util.ArrayList;
import java.util.List;

public class Panda extends Bear {

	public String a = "Panda";
	@Override
	public void eat() {
		System.out.println("Panda bear is chewing");
	}
	
	public void eat (int kgs) {
		System.out.println("Panda ate " + kgs + " kilos of food");
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("Abstract classes can have main methods.");
		Bear panda = new Panda();
		panda.eat();
		List<String> list = new ArrayList<>();
		System.out.println(list.getClass());
		System.out.println(panda.a);
	}
}
