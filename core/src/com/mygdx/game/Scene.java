package com.mygdx.game;

public abstract class Scene {
	final int INDEX;
	private GameClass parentGame;
	protected int nextScene;
	public Scene(int index, GameClass parentGame) {
		this.INDEX = index;
		this.parentGame = parentGame;
	}
	protected void sceneChange(){
		parentGame.sceneChange(nextScene);
	}
	public abstract void update();

	public abstract void render();

	public abstract void resize(int width, int height);

	public abstract void dispose();
	
}
