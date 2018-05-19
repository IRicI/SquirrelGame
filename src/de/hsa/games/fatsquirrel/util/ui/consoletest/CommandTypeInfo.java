package de.hsa.games.fatsquirrel.util.ui.consoletest;

public interface CommandTypeInfo {
	public String getName();
	public String getHelpText();
	public Class<?>[] getParamTypes();

}
