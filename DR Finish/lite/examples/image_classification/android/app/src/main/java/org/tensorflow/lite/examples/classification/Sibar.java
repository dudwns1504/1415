package org.tensorflow.lite.examples.classification;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Sibar extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sibar);

        ImageView imageView = findViewById(R.id.imageView_11102);
        String url = "https://firebasestorage.googleapis.com/v0/b/signup-2b39d.appspot.com/o/image%2FKorea%2FSummer%2F%EA%B2%80%EC%A0%95%20%EB%B0%98%EB%B0%94%EC%A7%80%20%EC%A4%84%EB%AC%B4%EB%8A%AC%20%EB%B0%98%ED%8C%94.PNG?alt=media&token=547da3ae-517a-427d-b383-f6661ef55063";
        Picasso.get().load(url).into(imageView);

    }
}
