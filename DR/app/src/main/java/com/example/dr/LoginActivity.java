package com.example.dr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView Notlog, register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Notlog = (TextView)findViewById(R.id.NotLogin);
        register = (TextView)findViewById(R.id.register);

        Notlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                LoginActivity.this.startActivity(intent);
            }
        });
    }
}
