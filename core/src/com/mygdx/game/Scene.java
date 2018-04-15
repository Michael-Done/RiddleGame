package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class Scene {
	final int INDEX;
	private GameClass parentGame;
	protected int nextScene;
	public Stage stage;
	public Scene(int index, GameClass parentGame) {
		this.INDEX = index;
		this.parentGame = parentGame;
		nextScene = index + 1;
		stage = new Stage();
	}
	protected void sceneChange(){
		parentGame.sceneChange(nextScene);
	}
	public abstract void update();

	public abstract void render();

	public abstract void resize(int width, int height);

	public abstract void dispose();
	
}
