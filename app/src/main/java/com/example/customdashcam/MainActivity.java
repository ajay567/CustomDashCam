package com.example.customdashcam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button recordPage = findViewById(R.id.HomeRecordParam);

        recordPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);

            }
        });

        final Button galleryPage = findViewById(R.id.StartPreview);

        galleryPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(intent);

            }
        });


    }
}
