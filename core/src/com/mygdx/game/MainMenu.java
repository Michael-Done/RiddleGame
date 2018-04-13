package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;


public class MainMenu extends Scene {
	//The stage for the UI elements to be placed on
	Stage stage;
	//The table for the buttons
	Table table;
	//The graphics skin for the UI elements
	Skin skin;
	//The Buttons
	TextButton startButton;
	TextButton instructionsButton;
	TextButton settingsButton;
	TextButton creditsButton;
	TextButton exitButton;
	public MainMenu(int index, GameClass parentGame) {
		super(index, parentGame);
		//skin setup
		skin = new Skin(Gdx.files.internal("commodore/uiskin.json"));
		
		//Initialize the stage
		stage  = new Stage();
		((OrthographicCamera) stage.getCamera()).zoom = 800f/Gdx.graphics.getWidth();
		
		//set the input process to receive input from the stage
		Gdx.input.setInputProcessor(stage);
		
		//setup the table
		table = new Table();
		table.setFillParent(true);
		//table.setDebug(true);
		
		//actor setup
		startButton = new TextButton("START", skin);
		instructionsButton = new TextButton("INSTRUCTIONS", skin);
		settingsButton = new TextButton("SETTINGS", skin);
		creditsButton = new TextButton("CREDITS", skin);
		exitButton = new TextButton("EXIT", skin);
		
		startButton.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y){
				
			}
		});
		
		exitButton.addListener(new ClickListener() {
			public void clicked(InputEvent event, float x, float y){
				Gdx.app.exit();
			}
		});
		table.add(startButton).left().pad(3);
		table.row();
		table.add(instructionsButton).pad(3);
		table.row();
		table.add(settingsButton).left().pad(3);
		table.row();
		table.add(creditsButton).left().pad(3);
		table.row();
		table.add(exitButton).left().pad(3);
		stage.addActor(table);
		
	}
	@Override
	public void update(){
		stage.act(Gdx.graphics.getDeltaTime());
	}
	@Override
	public void render(){
		update();
		stage.draw();
	}
	@Override
	public void resize(int width, int height){
		stage.getViewport().update(width, height, true);
	}
	@Override
	public void dispose(){
		stage.dispose();
	}

}
