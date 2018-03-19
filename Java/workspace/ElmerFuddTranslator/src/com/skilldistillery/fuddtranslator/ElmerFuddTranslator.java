package com.skilldistillery.fuddtranslator;

public class ElmerFuddTranslator extends AbstractTranslator {
	@Override
	public String translateWord (String word) {
		if (word == null) {
			return "";
		}
		
		String fuddWord = word;
		
		fuddWord = fuddWord.replaceAll("r", "w");
		fuddWord = fuddWord.replaceAll("R", "W");
		fuddWord = fuddWord.replaceAll("l", "w");
		fuddWord = fuddWord.replaceAll("L", "W");
		
		
		return fuddWord;
	}
	
	
}
