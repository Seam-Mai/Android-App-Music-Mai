package com.seammai.mai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        BottomNavigationView bottomNavigationView = findViewById(R.id.menu_all);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.bottom_home) {
                return true;
            } else if (itemId == R.id.bottom_search) {
                startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (itemId == R.id.bottom_Librabry) {
                startActivity(new Intent(getApplicationContext(), LibrabryActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (itemId == R.id.bottom_profile) {
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            return false;
        });

        TextView textView = findViewById(R.id.zedes);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SecondActivity.this,PlayMusic.class);
                startActivity(intent);
            }
        });
        ImageView imageView = findViewById(R.id.zedess);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SecondActivity.this,PlayMusic.class);
                startActivity(intent);
            }
        });
       ImageView imageView1= findViewById(R.id.jo);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SecondActivity.this,Vanda_PlayMusic.class);
                startActivity(intent);
            }
        });
        TextView textViews = findViewById(R.id.joo);
        textViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SecondActivity.this,Vanda_PlayMusic.class);
                startActivity(intent);
            }
        });
        ImageView imageView2= findViewById(R.id.tenamusic);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SecondActivity.this,Tena_PlayMusic.class);
                startActivity(intent);
            }
        });
        ImageView imageView3= findViewById(R.id.gmengz_music);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SecondActivity.this,Gmengz_PlayMusic.class);
                startActivity(intent);
            }
        });

  }

}
