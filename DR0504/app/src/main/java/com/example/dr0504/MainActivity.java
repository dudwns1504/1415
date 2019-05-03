package com.example.dr0504;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton Cate, set, shop, search, language;
    Dialog dialog;
    Button Korea, America, Japan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cate = (ImageButton)findViewById(R.id.CateButton);
        set = (ImageButton)findViewById(R.id.SettingButton);
        shop = (ImageButton)findViewById(R.id.ShopButton);
        search = (ImageButton)findViewById(R.id.search);
        language = (ImageButton)findViewById(R.id.lang);

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sintent = new Intent(MainActivity.this, ShoppingActivity.class);
                MainActivity.this.startActivity(sintent);
            }
        });
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seintent = new Intent(MainActivity.this, SettingActivity.class);
                MainActivity.this.startActivity(seintent);
            }
        });
        Cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cintent = new Intent(MainActivity.this, CateActivity.class);
                MainActivity.this.startActivity(cintent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                MainActivity.this.startActivity(searchIntent);
            }
        });
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.nationdialog);

                America = (Button)dialog.findViewById(R.id.america);
                Japan = (Button)dialog.findViewById(R.id.japan);
                Korea = (Button)dialog.findViewById(R.id.korea) ;

                Korea.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"현재 해당 국가입니다.", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

    }
}