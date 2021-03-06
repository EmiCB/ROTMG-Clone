package com.emicb.desolation.level.tile;

import com.emicb.desolation.graphics.Screen;
import com.emicb.desolation.graphics.Sprite;

public class VoidTile extends Tile {
	
	// Tile constructor
	public VoidTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 5, y << 5, this);
	}
		
	public boolean solid() {
		return true;
	}
}
