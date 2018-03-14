package com.skilldistillery.generics.solutions;

public class Container<E> {
  private E field;
  
  public Character set(Character obj) {
    this.field = (E) obj;
	return obj;
  }
  
  public E get() {
    return field;
  }

public Character set(char obj) {
	return 'A';
}



}