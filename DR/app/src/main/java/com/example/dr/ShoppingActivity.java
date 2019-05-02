package com.example.dr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ShoppingActivity extends AppCompatActivity {
    ImageButton Home, Cate, set;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        Home = (ImageButton) findViewById(R.id.HomeButton);
        Cate = (ImageButton)findViewById(R.id.CateButton);
        set = (ImageButton)findViewById(R.id.SettingButton);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hIntent = new Intent(ShoppingActivity.this, MainActivity.class);
                ShoppingActivity.this.startActivity(hIntent);
            }
        });

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seintent = new Intent(ShoppingActivity.this, SettingActivity.class);
                ShoppingActivity.this.startActivity(seintent);
            }
        });
        Cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cintent = new Intent(ShoppingActivity.this, CateActivity.class);
                ShoppingActivity.this.startActivity(cintent);
            }
        });

    }
}
