package com.skilldistillery.advancedarrays.drills;

public class PopStarDriver {
	public String name;
	public static void main(String[] args) {
		
		PopStar[] bandMember = new PopStar[4];

		for (int i = 0; i < bandMember.length; i++) {
			bandMember[i] = new PopStar();
		}

		bandMember[0].name = "John";
		bandMember[1].name = "Paul";
		bandMember[2].name = "George";
		bandMember[3].name = "Ringo";

		for (int i = 0; i < bandMember.length; i++) {
			PopStar name = bandMember[i];
			name.sing();
		}
		

	}

}
