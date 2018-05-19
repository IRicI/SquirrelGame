package de.hsa.games.fatsquirrel.console;

import de.hsa.games.fatsquirrel.util.ui.console.CommandTypeInfo;

public enum GameCommandType implements CommandTypeInfo{
	HELP("help", "all commands"),
	EXIT("exit", "exit game"),
	ALL("all", "all"),
	LEFT("a", "move left"),
	UP("w", "move up"),
	DOWN("s", "move down"),
	RIGHT("d", "move right"),
	MASTER_ENERGY("master energy", "display of current master energy"),
	SPAWN_MINI("spawn mini", "spawn one minisquirrel", int.class);
	private String name;
	private String description;
	private Class<Integer> minienergy;
	
	GameCommandType (String name, String description){
		this.name = name;
		this.description = description;
	}
	GameCommandType (String name, String description, Class<Integer> minienergy){
		this.name = name;
		this.description = description;
		this.minienergy = minienergy;
	}
	public String getName() {
		return name;
	}
	@Override
	public Class<Integer> getParamType() {
		return minienergy;
	}
	@Override
	public String getHelpText() {
		return description;
	}
	
}
