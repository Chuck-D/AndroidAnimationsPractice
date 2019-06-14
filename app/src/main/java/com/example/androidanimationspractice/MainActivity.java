package com.example.androidanimationspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void fade(View view){
        Log.i("Info", "ImageView tapped");
        ImageView bartImageView = findViewById(R.id.bartImageView);
        //      ImageView homerImageView = findViewById(R.id.homerImageView);

        // animate off the bottom of screen
        //  bartImageView.animate().translationYBy(1700).setDuration(2000);

        //animate off screen to the left
        // bartImageView.animate().translationXBy(-1700).setDuration(2000);


        //rotation

        // bartImageView.animate().rotation(1800).alpha(0).setDuration(1000);

        //scale

        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = findViewById(R.id.bartImageView);

        //setting initial position off screen.  then making it rotate in
        bartImageView.setX(-1000);
        bartImageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }
}
