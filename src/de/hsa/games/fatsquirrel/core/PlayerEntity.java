package de.hsa.games.fatsquirrel.core;

public abstract class PlayerEntity extends Character{
	protected MoveCommand nMoveCommand;

	public PlayerEntity(int id, XY xy,int energy) {
		super(id, xy, energy);
	}
	public void setMoveCommand(MoveCommand movecommand) {
		nMoveCommand = movecommand;
	}
	

}
