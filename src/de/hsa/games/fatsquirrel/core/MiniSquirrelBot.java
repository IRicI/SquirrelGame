package de.hsa.games.fatsquirrel.core;

import de.hsa.games.fatsquirrel.botapi.ControllerContext;

public class MiniSquirrelBot extends MiniSquirrel{
	public MiniSquirrelBot(int id, XY xy, int energy, int masterid) {
		super(id, xy, energy, masterid);
		
		
	}
	public void nextstep() {
			
	}

	public class ControllerContextImpl implements ControllerContext{

		@Override
		public XY getViewLowerLeft() {
			int x = getPosition().getX() - 10;
			int y = getPosition().getY() - 10;
			return new XY (x,y);
		}

		@Override
		public XY getViewUpperRight() {
			int x = getPosition().getX() + 10;
			int y = getPosition().getY() + 10;
			return new XY (x,y);
		}

		@Override
		public String getEntityAt(XY xy) {
			
			return null;
		}

		@Override
		public void move(XY direction) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void spawnMiniBot(XY direction, int energy) {			
		}

		@Override
		public int getEnergy() {
			return 0;
		}
		
	}
}
