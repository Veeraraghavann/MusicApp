package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the classic category
        TextView classic = findViewById(R.id.classical);

        // Set a click listener on that View
        classic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classic View is clicked on.
            @Override
            public void onClick(View view) {
                Intent classicIntent = new Intent(MainActivity.this, ClassicActivity.class);
                startActivity(classicIntent);
            }
        });


        // Find the View that shows the folk category
        TextView folk = findViewById(R.id.folk);

        // Set a click listener on that View
        folk.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the folk View is clicked on.
            @Override
            public void onClick(View view) {
                Intent folkIntent = new Intent(MainActivity.this, FolkActivity.class);
                startActivity(folkIntent);
            }
        });


        // Find the View that shows the carnatic category
        TextView carnatic = findViewById(R.id.carnatic);

        // Set a click listener on that View
        carnatic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the carnatic View is clicked on.
            @Override
            public void onClick(View view) {
                Intent carnaticIntent = new Intent(MainActivity.this, CarnaticActivity.class);
                startActivity(carnaticIntent);
            }
        });
    }
}
