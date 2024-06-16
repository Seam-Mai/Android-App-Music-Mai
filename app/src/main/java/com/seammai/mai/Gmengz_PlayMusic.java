package com.seammai.mai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Gmengz_PlayMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gmengz_playmusic);

        ImageView imageView= findViewById(R.id.back_gmengzmusic);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Gmengz_PlayMusic.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
