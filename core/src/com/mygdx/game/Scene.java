package com.mygdx.game;

public abstract class Scene {
	final int INDEX;

	public Scene(int index) {
		this.INDEX = index;
	}

	public abstract void update();

	public abstract void render();

	public abstract void resize(int width, int height);

	public abstract void dispose();
}
