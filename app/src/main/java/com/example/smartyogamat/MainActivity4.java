package com.example.smartyogamat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);  // Set the layout for the fourth slide

        // Find the "Next" button
        Button nextButton = findViewById(R.id.nextButton);

        // Set an OnClickListener to navigate to the next screen or close the app
        nextButton.setOnClickListener(v -> {
            // Navigate to the final screen or finish the onboarding process
            // If this is the last slide, you can either go to the main activity or finish the app
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);  // Replace with your main activity
            startActivity(intent);
            finish();  // Close the slide activity
        });
    }
}
