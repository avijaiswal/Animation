package com.example.appinventiv.animation;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview=(ImageView)findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
              imageview.startAnimation(animation);
    }
    

        public void slide(View view){
            ImageView image = (ImageView)findViewById(R.id.imageView);
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
            image.startAnimation(animation1);
        }
}
