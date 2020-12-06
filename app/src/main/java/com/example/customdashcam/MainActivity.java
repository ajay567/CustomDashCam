package com.example.customdashcam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private boolean permission;
    private File storage;
    private String[] allPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // load data here
        // Get all storage areas path
        allPath = StorageUtil.getStorageDirectories(this);

        for(String path: allPath) {
            storage = new File(path);
            Method.load_Directory_Files(storage);
        }

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
