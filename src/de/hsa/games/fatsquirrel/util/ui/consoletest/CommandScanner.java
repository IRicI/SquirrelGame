package de.hsa.games.fatsquirrel.util.ui.consoletest;

import java.io.BufferedReader;
import java.io.IOException;

public class CommandScanner {
	private BufferedReader inputReader;
	public CommandScanner(BufferedReader inputReader) throws IOException {
			this.inputReader = inputReader;
			
	}
	@SuppressWarnings("null")
	public Command next() {
		String input ="";
		try {
			input = inputReader.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		String[] splittinput = input.split(" ");
		Command command = null;
		switch(splittinput[0]) {
		case "help":
			command = new Command(MyFavoriteCommandType.HELP, splittinput);
		    break;
		case "exit":
			command = new Command(MyFavoriteCommandType.EXIT, splittinput);
		    break;
		case "addi":
			Integer[] integerarray = {Integer.valueOf(splittinput[1]), Integer.valueOf(splittinput[2])};
			command = new Command(MyFavoriteCommandType.ADDI, integerarray);
		    break;
		case "addf":
			Float[] floatarray = {Float.valueOf(splittinput[1]), Float.valueOf(splittinput[2])};
			command = new Command(MyFavoriteCommandType.ADDF, floatarray);
		    break;
		case "echo":
			Object[] echoarray = {splittinput[1], Integer.valueOf(splittinput[2])};
			command = new Command(MyFavoriteCommandType.ECHO, echoarray);
		    break;
		default:
			System.err.println("Wrong command!");
			command = next();
			break;
		}
		return command;
	}
	}
