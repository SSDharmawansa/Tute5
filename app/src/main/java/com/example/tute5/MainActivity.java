package com.example.yourpackagename;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button latestPostsButton, problemsButton, newsAndEventsButton, donationsButton,
            successStoriesButton, findLocationsButton, aboutUsButton, contactUsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latestPostsButton = findViewById(R.id.latestPostsButton);
        problemsButton = findViewById(R.id.problemsButton);
        newsAndEventsButton = findViewById(R.id.newsAndEventsButton);
        donationsButton = findViewById(R.id.donationsButton);
        successStoriesButton = findViewById(R.id.successStoriesButton);
        findLocationsButton = findViewById(R.id.findLocationsButton);
        aboutUsButton = findViewById(R.id.aboutUsButton);
        contactUsButton = findViewById(R.id.contactUsButton);

        // Set click listeners for each button
        latestPostsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle LATEST POSTS button click
            }
        });

        problemsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle PROBLEMS button click
            }
        });

        // Similarly, add click listeners for other buttons

    }
}
