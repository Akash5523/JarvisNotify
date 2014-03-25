package com.anand.jarvisnotify;

import com.parse.Parse;
import com.parse.PushService;

public class Application extends android.app.Application {

  public Application() {
  }

  @Override
  public void onCreate() {
    super.onCreate();

	// Initialize the Parse SDK.
	Parse.initialize(this, "KZ8JgdneA2bHnodna2wGBbyx1ZX89NCbByHH1G3U", "ChfKSfc6m3lekfPDUg3GRtj73UP5B8ayjid9zBxT"); 

	// Specify an Activity to handle all pushes by default.
	PushService.setDefaultPushCallback(this, MainActivity.class);
  }
}
