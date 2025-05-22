package com.example.hotel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ClientHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_client_home);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnMakeReservation = findViewById(R.id.btn_make_reservation);
        btnMakeReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ClientHomeActivity.this, SelectRoomActivity.class);
                startActivity(intent);
            }
        });

        Button btnMyReservations = findViewById(R.id.btn_my_reservations);
        btnMyReservations.setOnClickListener(v -> {
            Intent intent = new Intent(ClientHomeActivity.this, MyReservationsActivity.class);
            startActivity(intent);
        });

        Button btnGallery = findViewById(R.id.btn_gallery);
        btnGallery.setOnClickListener(v -> {
            Intent intent = new Intent(ClientHomeActivity.this, GalleryActivity.class);
            startActivity(intent);
        });
    }
}
