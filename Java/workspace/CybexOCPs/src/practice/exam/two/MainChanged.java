package practice.exam.two;

import java.util.ArrayList;
import java.util.List;

public class MainChanged {
	
	 public static void main(String args[]){
		System.out.println("Hey, it worked!");
		List <Double> l = new ArrayList<>();
		System.out.println(l.contains("String"));
		
		int[] nums = {1, 2, 6};
		Object o = nums;
		int[] two = (int[])o;
		System.out.println(two[2]);
		
		String s = null;
		System.out.println();
		
	}


}