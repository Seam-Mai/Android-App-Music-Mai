package com.seammai.mai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Tena_PlayMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tena_playmusic);

        ImageView imageView= findViewById(R.id.back_tenamusic);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Tena_PlayMusic.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
