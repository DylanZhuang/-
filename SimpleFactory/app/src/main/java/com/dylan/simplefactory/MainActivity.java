package com.dylan.simplefactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cookFish("steam");
        cookFish("fry");
    }

    private void cookFish(String type) {
        Fish fish = CookFishFactory.createFish(type);
        if (fish != null) {
            fish.cook();
        }
    }
}
