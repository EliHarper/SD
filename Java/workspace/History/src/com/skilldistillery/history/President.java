package com.skilldistillery.history;

import java.time.LocalDate;
import java.time.Period;

public class President implements Comparable<President> {
  private int termNumber;
  private String firstName;
  private String middleName;
  private String lastName;
  private int electionsWon;
  private String whyLeftOffice;
  private String party;
  private LocalDate termBegan;
  private LocalDate termEnded;

//  term, fName, mName, lName, termBegan, termEnded, won, whyLeft, party
  public President(int term, String fName, String mName, String lName, LocalDate termBegan, LocalDate termEnded, int won,
		String whyLeft, String party) {
	  super();
	    this.termNumber = term;
	    this.firstName = fName;
	    this.middleName = mName;
	    this.lastName = lName;
	    this.electionsWon = won;
	    this.whyLeftOffice = whyLeft;
	    this.party = party;
	    this.termBegan = termBegan;
	    this.termEnded = termEnded;
	  }

public int getTermNumber() {
    return termNumber;
  }

  public void setTermNumber(int termNumber) {
    this.termNumber = termNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getElectionsWon() {
    return electionsWon;
  }

  public void setElectionsWon(int electionsWon) {
    this.electionsWon = electionsWon;
  }

  public String getWhyLeftOffice() {
    return whyLeftOffice;
  }

  public void setWhyLeftOffice(String reasonLeftOffice) {
    this.whyLeftOffice = reasonLeftOffice;
  }

  public String getParty() {
    return party;
  }

  public void setParty(String party) {
    this.party = party;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(termNumber + ": ");
    builder.append(firstName + " ");
    if (middleName.length() > 0) {
      builder.append(middleName + " ");
    }
    builder.append(lastName);
    builder.append(" (" + party + ")");
    builder.append(", electionsWon=");
    builder.append(electionsWon);
    builder.append("(");
    builder.append(getTermLength());
    builder.append(")");
    builder.append(", whyLeftOffice=");
    builder.append(whyLeftOffice);
    return builder.toString();
  }

  @Override
  public int compareTo(President other) {
    if (this.termNumber > other.termNumber) {
      return 1;
    } else if (this.termNumber < other.termNumber) {
      return -1;
    }
    return 0;
  }
  public Period getTermLength() {
		Period termLength = null;
		if (termEnded == null) {
			termEnded = LocalDate.now();
		}
		termLength = Period.between(termBegan, termEnded);
		return termLength;
	}
  
public LocalDate getTermBegan() {
	return termBegan;
}

public void setTermBegan(LocalDate termBegan) {
	this.termBegan = termBegan;
}

public LocalDate getTermEnded() {
	return termEnded;
}

public void setTermEnded(LocalDate termEnded) {
	this.termEnded = termEnded;
}

}