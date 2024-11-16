package com.example.smartyogamat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);  // Set the layout for the fifth slide

        // Find the "Connect Now" button
        Button connectButton = findViewById(R.id.connectButton);

        // Set an OnClickListener to initiate the connection process (Bluetooth/Wi-Fi)
        connectButton.setOnClickListener(v -> {
            // Navigate to the next step, which could involve the actual connection logic
            // You can open a new activity to handle the connection to the mat
            Intent intent = new Intent(MainActivity5.this, ConnectActivity.class);  // Replace with actual connection activity
            startActivity(intent);
            finish();  // Close the slide activity
        });
    }
}
