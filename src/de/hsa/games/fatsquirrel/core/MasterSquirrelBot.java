package de.hsa.games.fatsquirrel.core;

import de.hsa.games.fatsquirrel.botapi.ControllerContext;

public class MasterSquirrelBot extends MasterSquirrel {
	public MasterSquirrelBot(int id, XY xy) {
		super(id, xy);
	}
	public void nextstep() {
		
	}

	public class ControllerContextImpl implements ControllerContext{

		@Override
		public XY getViewLowerLeft() {
			int x = getPosition().getX() - 15;
			int y = getPosition().getY() - 15;
			return new XY (x,y);
		}

		@Override
		public XY getViewUpperRight() {
			int x = getPosition().getX() + 15;
			int y = getPosition().getY() + 15;
			return new XY (x,y);
		}

		@Override
		public String getEntityAt(XY xy) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void move(XY direction) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void spawnMiniBot(XY direction, int energy) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getEnergy() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
