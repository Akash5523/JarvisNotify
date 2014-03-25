package com.parse.demo;

import com.parse.Parse;
import com.parse.ParseACL;

import com.parse.ParseUser;

import android.app.Application;

public class ToDoListApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		Parse.initialize(this, "AIzaSyD7IdZEMbjFmCAEszxXNWAumN3VIfEUazs", "243963372068-sjspcf36c56sk9oiracgvi9bcr3bn2ff.apps.googleusercontent.com");


		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
		// Optionally enable public read access.
		// defaultACL.setPublicReadAccess(true);
		ParseACL.setDefaultACL(defaultACL, true);
	}

}
