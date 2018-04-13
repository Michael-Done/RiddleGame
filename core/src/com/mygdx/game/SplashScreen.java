package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class SplashScreen extends Scene {
	// The stage for the UI elements to be placed on
	Stage stage;
	// The table for the buttons
	Table table;
	// The graphics skin for the UI elements
	Skin skin;
	Label title;

	public SplashScreen(int index, GameClass parentGame) {
		super(index, parentGame);
		// skin setup
		skin = new Skin(Gdx.files.internal("commodore/uiskin.json"));

		// Initialize the stage
		stage = new Stage();
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
	}

	@Override
	public void update() {
		stage.act(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
