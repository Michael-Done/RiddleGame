package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class Instructions extends Scene {
	// The table for the buttons
	Table table;
	// The graphics skin for the UI elements
	Skin skin;
	Label instructions;
	TextButton back;

	public Instructions(int index, GameClass parentGame) {
		super(index, parentGame);
		// skin setup
		skin = new Skin(Gdx.files.internal("commodore/uiskin.json"));
		((OrthographicCamera) stage.getCamera()).zoom = 800f / Gdx.graphics.getWidth();

		// setup the table
		table = new Table();
		table.setFillParent(true);
		// table.setDebug(true);

		instructions = new Label(
				" Given the end of a story, you \n must ask YES/NO questions to \n determine the full series of \n events leading up to the end.",
				skin);
		back = new TextButton("BACK", skin);
		back.addListener(new ClickListener(){
			public void clicked(InputEvent event, float x, float y){
				nextScene = 1;
				sceneChange();
			}
		});
		table.add(instructions).pad(6);
		table.row();
		table.add(back);
		stage.addActor(table);
		this.nextScene = 1;
	}

	@Override
	public void update() {
		stage.act(Gdx.graphics.getDeltaTime());
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
