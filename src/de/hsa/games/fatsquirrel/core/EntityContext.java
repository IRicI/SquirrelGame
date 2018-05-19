package de.hsa.games.fatsquirrel.core;

public interface EntityContext {
	
	public XY getSize();
	public void tryMove (MiniSquirrel minisquirrel, XY direction);
	public void tryMove (GoodBeast goodbeast, XY direction);
	public void tryMove (BadBeast badbeast, XY direction);
	public void tryMove (MasterSquirrel master, XY direction);
	public PlayerEntity nearestPlayer (XY playerpos);

	public void kill (Entity entity);
	public void killandReplace (Entity entity);
	public String getEntityType (XY xy);
}
