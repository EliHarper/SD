package com.skilldistillery.generics.drills;

import java.util.ArrayList;

/**
 * Note: this Stack implementation has an issue, in that we could add nulls, but we also 
 * return null for an empty list. We will have to live with this. 
 * 
 * E push(E item) - add an item to the Stack. Return a reference to the item.
E pop() - remove and return the item at the top of the Stack, or null if the Stack is empty.
E peek() - return the item at the top of the Stack, but do not remove it. Return null if the Stack is empty.
int search(Object o) - search for the item in the Stack by iterating through the list and calling item.equals(o). Return the index of the item, or -1 if it is not in the Stack.
 * @param <E>
 */
public class Stack<E> {
ArrayList <E> stack = new ArrayList<>();
  
  public Stack() {
  }
  
  public Object push(E item) {
    stack.add(item);
    
    return item;
  }
  
  public E pop() {
    for (int i = 0; i < stack.size(); i++) {
		if (i == (stack.size() -1)) {
			E e = stack.remove(i);
			return e;
		}
	}
    return null;
  }
  
  public E peek() {
    if (stack.size() > 0) {
		return (stack.get(stack.size() -1));
	}
    return null;
  }
  
  public int search(E o) {
	  for (int i = 0; i < stack.size(); i++) {
		if (stack.get(i).equals(o)) {
			return i;
		}
	}
    return -1;
  }
}
