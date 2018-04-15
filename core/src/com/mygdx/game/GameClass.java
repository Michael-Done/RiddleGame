package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.Array;

public class GameClass extends ApplicationAdapter {
	MainMenu mainMenu;
	Scene splashScreen;
	private int currentScene;
	Array<Scene> scenes;
	OrthographicCamera cam;
	@Override
	public void create() {
		
		currentScene = 0;
		
		splashScreen = new SplashScreen(0, this);
		mainMenu = new MainMenu(0, this);
		scenes = new Array<Scene>();
		scenes.add(splashScreen);
		scenes.add(mainMenu);
		System.out.println(scenes.get(1).getClass());
		cam = (OrthographicCamera) scenes.get(0).stage.getCamera();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(66 / 255.0f, 66 / 255.0f, 231 / 255.0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		cam.update();
		scenes.get(currentScene).render();
	}

	public void sceneChange(int index) {
		currentScene = index;
		Gdx.input.setInputProcessor(scenes.get(currentScene).stage);
		cam = (OrthographicCamera) scenes.get(currentScene).stage.getCamera();
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
