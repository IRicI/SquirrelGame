package de.hsa.games.fatsquirrel.util.ui.console;

import de.hsa.games.fatsquirrel.util.ui.console.CommandTypeInfo;

public class Command {
	public CommandTypeInfo commandtype;
	private Object[] minienergy;

	public Command (CommandTypeInfo commandtype, Object[] minienergy) {
		this.commandtype = commandtype;
		this.minienergy = minienergy;
	}

	public Object[] getMinienergy() {
		return minienergy;
	}

	public CommandTypeInfo getCommandType() {
		return commandtype;
	}
}
