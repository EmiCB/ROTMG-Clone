package com.emicb.desolation.level.tile;

//TIP: Ctrl + Shift + O imports
//******************** Imports Things ********************
import com.emicb.desolation.graphics.Screen;
import com.emicb.desolation.graphics.Sprite;


public class GrassTile extends Tile {

	// Tile constructor
	public GrassTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 5, y << 5, this);
	}
}
