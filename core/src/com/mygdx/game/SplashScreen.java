package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class SplashScreen extends Scene {
	// The table for the buttons
	Table table;
	// The graphics skin for the UI elements
	Skin skin;
	Label title;
	int timer;
	public SplashScreen(int index, GameClass parentGame) {
		super(index, parentGame);
		timer = 0;
		// skin setup
		skin = new Skin(Gdx.files.internal("commodore/uiskin.json"));
		((OrthographicCamera) stage.getCamera()).zoom = 800f / Gdx.graphics.getWidth();

		// set the input process to receive input from the stage
		Gdx.input.setInputProcessor(stage);

		// setup the table
		table = new Table();
		table.setFillParent(true);
		// table.setDebug(true);

		title = new Label("RIDDLES", skin);
		table.add(title);
		
		stage.addActor(table);
		this.nextScene = 1;
	}

	@Override
	public void update() {
		stage.act(Gdx.graphics.getDeltaTime());
		timer += 1;
		if(timer == 60*3){
			this.sceneChange();
		}
		
	}

	@Override
	public void render() {
		update();
		stage.draw();

	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void dispose() {
		stage.dispose();
	}

}
