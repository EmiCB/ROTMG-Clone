package com.emicb.desolation.level.tile;

//TIP: Ctrl + Shift + O imports
//******************** Imports Things ********************
import com.emicb.desolation.graphics.Screen;
import com.emicb.desolation.graphics.Sprite;


public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	// Set tiles
	public static Tile grass = new GrassTile(Sprite.grass);
	
	// Tile constructor
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	// Always put this in tile classes
	public void render(int x, int y, Screen screen) {
		
	}
	
	// checks if tile is solid or if you can pass through, default is not solid
	// DO NOT copy this if you are not overriding with a true (redundant)
	public boolean solid() {
		return false;
	}
}