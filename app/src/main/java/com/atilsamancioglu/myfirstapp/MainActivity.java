package com.atilsamancioglu.myfirstapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void changeImage(View view) {

        ImageView imageView = (ImageView) findViewById(R.id.myImage);
        imageView.setImageResource(R.drawable.metallica2);
    }


}
