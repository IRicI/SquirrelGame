package de.hsa.games.fatsquirrel.util.ui.consoletest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MyFavoriteCommandsProzessor {
	private PrintStream outputStream = System.out;
	private static BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		MyFavoriteCommandsProzessor myfavoritecommandsprozessor = new MyFavoriteCommandsProzessor();
		myfavoritecommandsprozessor.process();
	}
	private void help(MyFavoriteCommandType command) {
		StringBuffer stringbuffer = new StringBuffer();
		for ( int i = 0; i<MyFavoriteCommandType.values().length; i++) {
			stringbuffer.append(MyFavoriteCommandType.values()[i].getName() + ": " + MyFavoriteCommandType.values()[i].getHelpText() + "\n");
		}
		outputStream.println(stringbuffer.toString());
		
	}
	public void process() throws IOException {
		CommandScanner commandScanner = new CommandScanner(inputReader);
		Command command;
		while (true) { // the loop over all commands with one input line for every command
			
			command = commandScanner.next();
			
		MyFavoriteCommandType commandType = (MyFavoriteCommandType) command.getCommandType();
		
		switch (commandType) {
		case EXIT:
			System.exit(0);
		case HELP:
			help(commandType);
			break;
		case ADDI:
			int addi = (int) command.getParams()[0] + (int) command.getParams()[1];
			outputStream.println(addi);
			break;
		case ADDF:
			float addf = (float) command.getParams()[0] + (float) command.getParams()[1];
			outputStream.println(addf);
			break;
		case ECHO:
			for(int i = 0;i < (int) (command.getParams()[1]); i++) {
				outputStream.println(command.getParams()[0]);
			}
			break;
			
		}
		}
	}

}
