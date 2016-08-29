package com.tutorialspoint;

public class TextEditor {

	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		System.out.println("Inside getSpellChecker");
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
		System.out.println("Inside setSpellChecker");
		
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
	
}
