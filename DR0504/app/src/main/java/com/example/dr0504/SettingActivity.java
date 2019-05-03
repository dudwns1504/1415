package com.example.dr0504;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SettingActivity extends AppCompatActivity {
    ImageButton Home, Shopping, Cate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Home = (ImageButton)findViewById(R.id.HomeButton);
        Shopping = (ImageButton)findViewById(R.id.ShopButton);
        Cate = (ImageButton)findViewById(R.id.CateButton);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hIntent = new Intent(SettingActivity.this, MainActivity.class);
                SettingActivity.this.startActivity(hIntent);
            }
        });
        Shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sIntent = new Intent(SettingActivity.this, ShoppingActivity.class);
                SettingActivity.this.startActivity(sIntent);
            }
        });
        Cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cIntent = new Intent(SettingActivity.this, CateActivity.class);
                SettingActivity.this.startActivity(cIntent);
            }
        });
    }
}
