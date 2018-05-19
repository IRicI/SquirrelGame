package de.hsa.games.fatsquirrel.core;


public class Wall extends Entity{
	public Wall (int id, XY xy) {
		super(id, xy, energy);
	}

	final static int energy = -10;


}
