package com.example.dr0513;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class CateActivity extends AppCompatActivity {
    ImageButton Home, Setting, Shopping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cate);
        Home = (ImageButton)findViewById(R.id.HomeButton);
        Setting = (ImageButton)findViewById(R.id.SettingButton);
        Shopping = (ImageButton)findViewById(R.id.ShopButton);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hIntent = new Intent(CateActivity.this, MainActivity.class);
                CateActivity.this.startActivity(hIntent);
            }
        });
        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seIntent = new Intent(CateActivity.this, SettingActivity.class);
                CateActivity.this.startActivity(seIntent);
            }
        });
        Shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sIntent = new Intent(CateActivity.this, ShoppingActivity.class);
                CateActivity.this.startActivity(sIntent);
            }
        });
    }
}
