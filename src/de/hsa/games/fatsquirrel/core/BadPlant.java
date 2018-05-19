package de.hsa.games.fatsquirrel.core;


public class BadPlant extends Entity {
	public BadPlant(int id, XY xy) {
		super(id, xy, energy);
	}

	final static int energy = -100;

	
}
