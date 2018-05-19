package de.hsa.games.fatsquirrel.util.ui.consoletest;

@SuppressWarnings("serial")
public class ScanException extends Exception {
	ScanException(){
		super("Wrong Command");
	}
	ScanException(String string){
		super(string);
	}
}
