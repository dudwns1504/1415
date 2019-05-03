package com.example.dr0504;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class SearchActivity extends AppCompatActivity {
    ImageButton back, camera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        back = (ImageButton) findViewById(R.id.back);
        camera = (ImageButton)findViewById(R.id.cameraButton);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(SearchActivity.this, MainActivity.class);
                SearchActivity.this.startActivity(backIntent);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(SearchActivity.this, CameraActivity.class);
                SearchActivity.this.startActivity(cameraIntent);
            }
        });

    }
}
