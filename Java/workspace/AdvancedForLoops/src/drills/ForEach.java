package drills;

public class ForEach {

  // Use the code in each "forLoop" method to write a foreach loop
  // in the corresponding "forEachLoop" method. Verify that the loop outputs
  // are the same.
  public static void main(String[] args) {
    forEachLoop1();
    forLoop2();
    forEachLoop2();
    forLoop3();
    forEachLoop3();
  }

  static void forEachLoop1() {
    int[] intArr = { 10, 20, 30, 40 };
    // foreach loop here
    
    for (int i : intArr) {
		System.out.print(i+ " ");
	}

    System.out.println("--end forEachLoop1");
  }

  static void forLoop2() {
    String[] strings = new String[4];
    strings[0] = "First";
    strings[1] = "Second";
    strings[2] = "Third";
    strings[3] = "Fourth";
    for (String s : strings) {
      System.out.print(s + " ");
    }
    System.out.println("--end forLoop2");
  }

  static void forEachLoop2() {
    String[] strings = new String[4];
    strings[0] = "First";
    strings[1] = "Second";
    strings[2] = "Third";
    strings[3] = "Fourth";
    // foreach loop here
    
    for (String string : strings) {
		System.out.println(string + " ");
	}

    System.out.println("--end forEachLoop2");
  }

  static void forLoop3() {
    double doubleArr[] = { 1.1, 2.2, 3.3, 4.4 };
    for (int i = 0; i < doubleArr.length; i++) {
      System.out.print(doubleArr[i] + " ");
    }
    System.out.println("--end forLoop3");
  }

  static void forEachLoop3() {
    double doubleArr[] = { 1.1, 2.2, 3.3, 4.4 };
    // foreach loop here
    for (double d : doubleArr) {
		System.out.print(d + " ");
	}

    System.out.println("--end forEachLoop3");
  }

}
