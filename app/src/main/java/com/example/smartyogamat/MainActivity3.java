package com.example.smartyogamat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);  // Set the layout for the third slide

        // Find the "Next" button
        Button nextButton = findViewById(R.id.nextButton);

        // Set an OnClickListener to navigate to the next slide
        nextButton.setOnClickListener(v -> {
            // Navigate to the next screen (you can replace with your fourth slide activity)
            Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent);
        });
    }
}