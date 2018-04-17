package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class Settings extends Scene {
	// The table for the buttons
	Table table;
	// The graphics skin for the UI elements
	Skin skin;
	//The actors
	Label title;
	Label volume;
	
	public Settings(int index, GameClass parentGame) {
		super(index, parentGame);
		// skin setup
		skin = new Skin(Gdx.files.internal("commodore/uiskin.json"));
		((OrthographicCamera) stage.getCamera()).zoom = 800f / Gdx.graphics.getWidth();
		Gdx.input.setInputProcessor(stage);
		// setup the table
		table = new Table();
		table.setFillParent(true);
		// table.setDebug(true);
		
		
	}

	@Override
	public void update() {

	}

	@Override
	public void render() {

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void dispose() {

	}

}
