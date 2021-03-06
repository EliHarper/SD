package com.skilldistillery.subinit.solutions;

public class SuperClass2 {
  static {
    superStatic = singString("Top");
  }
  private static String superStatic = singString("superStatic declaration");
  private String superInstance = singString("superInstance declaration");

  public SuperClass2() {
    superInstance = singString("SuperClass()");
  }
  public static String singString(String text) {
    System.out.println(text);
    return text;
  }

  public static String getSuperStatic() {
    return superStatic;
  }

  public static void setSuperStatic(String superStatic) {
    SuperClass2.superStatic = superStatic;
  }

  public String getSuperInstance() {
    return superInstance;
  }

  public void setSuperInstance(String superInstance) {
    this.superInstance = superInstance;
  }
  static {
    superStatic = singString("Bottom");
  }
}
