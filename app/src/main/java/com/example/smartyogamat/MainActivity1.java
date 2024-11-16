package com.example.smartyogamat;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);  // Set the layout for the first slide

        // Find the "Next" button
        Button nextButton = findViewById(R.id.nextButton);

        // Set an OnClickListener to navigate to the next screen
        nextButton.setOnClickListener(v -> {
            // Navigate to the second slide (SecondSlideActivity)
            Intent intent = new Intent(MainActivity1.this, MainActivity2.class);
            startActivity(intent);
        });
    }
}
