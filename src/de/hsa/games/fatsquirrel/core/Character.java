package de.hsa.games.fatsquirrel.core;

public class Character extends Entity{

	public Character(int id, XY xy, int energy) {
		super(id, xy, energy);
	}
	public Character(Entity entity) {
		super(entity);
	}
	public void nextstep(EntityContext context) {
		
	}

}
