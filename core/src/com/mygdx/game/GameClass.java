package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.Array;

public class GameClass extends ApplicationAdapter {
	MainMenu mainMenu;
	SplashScreen splashScreen;
	OrthographicCamera cam;
	private int currentScene;
	Array<Scene> scenes;
	@Override
	public void create() {
		
		currentScene = 0;
		mainMenu = new MainMenu(1, this);
		cam = (OrthographicCamera) mainMenu.stage.getCamera();
		
		scenes = new Array<Scene>();
		scenes.add(mainMenu);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(66 / 255.0f, 66 / 255.0f, 231 / 255.0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		cam.update();
		mainMenu.render();
	}

	public void sceneChange(int index) {
		currentScene = index;
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
