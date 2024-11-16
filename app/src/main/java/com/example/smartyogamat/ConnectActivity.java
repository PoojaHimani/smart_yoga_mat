package com.example.smartyogamat;

//import android.annotation.SuppressLint;
//import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConnectActivity extends AppCompatActivity {

    private TextView connectionStatus;
    private ProgressBar progressBar;
    private Button connectButton;
    private boolean isConnected = false; // Simulate connection status

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect_activity);

        connectionStatus = findViewById(R.id.connectionStatus);
        progressBar = findViewById(R.id.connectionProgressBar);
        connectButton = findViewById(R.id.connectButton);

        // Set button click listener using lambda
        connectButton.setOnClickListener(v -> onConnectButtonClicked());
    }

    private void onConnectButtonClicked() {
        if (isConnected) {
            disconnectDevice();
        } else {
            connectToDevice();
        }
    }

    private void connectToDevice() {
        progressBar.setVisibility(View.VISIBLE);
        connectionStatus.setText(R.string.connecting); // Use the appropriate string

        // Simulate a connection attempt with a delay of 3 seconds
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            isConnected = true; // Simulating a successful connection
            onConnectionStatusChanged();
        }, 3000); // Simulated connection time (3 seconds)
    }

    private void disconnectDevice() {
        isConnected = false;
        onConnectionStatusChanged();
    }

    private void onConnectionStatusChanged() {
        progressBar.setVisibility(View.GONE);

        // Update UI based on connection status
        if (isConnected) {
            connectionStatus.setText(R.string.connected); // Add this string to strings.xml if missing
            connectButton.setText(R.string.disconnect); // Add this string to strings.xml if missing
        } else {
            connectionStatus.setText(R.string.disconnected); // Add this string to strings.xml if missing
            connectButton.setText(R.string.connect_to_mat);
        }
    }
}
