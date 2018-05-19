package de.hsa.games.fatsquirrel.util.ui.consoletest;

public class Command {
	public CommandTypeInfo commandtype;
	private Object[] params;

	public Command (CommandTypeInfo commandtype, Object[] params) {
		this.commandtype = commandtype;
		this.params = params;
	}

	public Object[] getParams() {
		return params;
	}

	public CommandTypeInfo getCommandType() {
		return commandtype;
	}
}
