package com.example.smartyogamat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);  // Set the layout for the second slide

        // Find the "Next" button
        Button nextButton = findViewById(R.id.nextButton);

        // Set an OnClickListener to navigate to the next slide
        nextButton.setOnClickListener(v -> {
            // Navigate to the next screen (you can replace with your 3rd slide activity)
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
        });
    }
}

