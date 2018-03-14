package com.skilldistillery.equalsandhashcode.drills;

public class NamedObject extends Object { // "extends Object" not actually needed

  private String name;

  public NamedObject(String name) {
    this.name = name;
  }
  
  // TODO Implement an equals method that determines if the passed Object is
  // a NamedObject, and if so compares its "name" field to the current object's.
  public boolean equals(Object other) {
	if (other == this) {return true;}
	if (!(other.getClass() == this.getClass())) {return false;}
	
	NamedObject otherNamedObject = (NamedObject) other;
	if (! otherNamedObject.name.equals(this.name) ) {
		return false;
	}
	return true;
  }
}
