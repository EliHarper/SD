package com.skilldistillery.Projects.Jets;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;


public class AirField {
	private Scanner kb = new Scanner(System.in);
	private ArrayList<Jet> jets;
	private int numJets = 0;
	
	public AirField(){
		jets = new ArrayList<Jet>();
		
		jets.add( new CargoPlane ("a380", 634, 445_000_000, 9445));
		jets.add( new CargoPlane ("Sky Glider", 20, 3, 10));
		jets.add( new FighterJet ("SR-71", 2200, 33_000_000, 3338));
		jets.add( new FighterJet("X-15", 4520, 7_300_000, 280));
		jets.add( new CargoPlane("Fiat CR.42", 323, 973_000, 780));
		
		numJets = jets.size();
	}
	
	public ArrayList <Jet> getJets(){
		ArrayList <Jet> jetCopy = new ArrayList<Jet>(jets);
		return jetCopy;
	}
	
	public ArrayList <Jet> addJet(){
	
		//First two prompts keep printing out at the same time
		
		System.out.println("Would you like to add a cargo plane or a fighter jet?");
		String cpOrFJ = kb.next();
		
		if (cpOrFJ.startsWith("c") || cpOrFJ.startsWith("C")) {
			
			System.out.println("What is its model?");
			kb.nextLine();
			String newModel = kb.nextLine();
			
			System.out.println("What is its max speed?");
			String newSpeedString = kb.nextLine();
			Double newSpeed = new Double("0");
			newSpeed = newSpeed.parseDouble(newSpeedString);
			
			System.out.println("How much does it cost?");
			String newPriceString = kb.nextLine();
			Double newPrice = new Double(0);
			newPrice = newSpeed.parseDouble(newSpeedString);
			
			System.out.println("What is its range?");
			String newRangeString = kb.nextLine();
			Integer newRange = new Integer(1);
			newRange = newRange.parseInt(newRangeString);
			
			jets.add(new CargoPlane (newModel, newSpeed.doubleValue(), newPrice.longValue(), newRange.intValue()));
			
			System.out.println("New number of jets: " + jets.size() );
			
		}
	
		else {
			System.out.println("What is its model?");
			kb.nextLine();
			String newModel = kb.nextLine();
			
			System.out.println("What is its max speed?");
			String newSpeedString = kb.nextLine();
			Double newSpeed = new Double("0");
			newSpeed = newSpeed.parseDouble(newSpeedString);
			
			System.out.println("How much does it cost?");
			String newPriceString = kb.nextLine();
			Double newPrice = new Double(0);
			newPrice = newSpeed.parseDouble(newSpeedString);
			
			System.out.println("What is its range?");
			kb.nextLine();
			String newRangeString = kb.nextLine();
			Integer newRange = new Integer(1);
			newRange = newRange.parseInt(newRangeString);
			
			
			jets.add(new FighterJet(newModel, newSpeed.doubleValue(), newPrice.longValue(), newRange.intValue()));
			
			System.out.println("New number of jets: " + jets.size() );
			
		}
		return jets;
	}
}
