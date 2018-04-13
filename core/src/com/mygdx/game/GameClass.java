package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameClass extends ApplicationAdapter {
	MainMenu mainMenu;
	OrthographicCamera cam;
	@Override
	public void create() {
		mainMenu = new MainMenu(0);
		cam = (OrthographicCamera) mainMenu.stage.getCamera();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(66/255.0f, 66/255.0f, 231/255.0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		cam.update();
		mainMenu.render();
	}
	@Override
	public void resize(int width, int height) {
		mainMenu.resize(width, height);
	}

	@Override
	public void dispose() {
		mainMenu.dispose();
	}
}
