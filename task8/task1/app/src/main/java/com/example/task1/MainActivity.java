package com.example.task1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import static java.lang.Math.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    static String aInput, bInput;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        aInput = findViewById(R.id.editTextText);
        bInput = String.valueOf(findViewById(R.id.editTextText2));
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }

    static double srednee;
    public void startNewActivity(View v){
        Double a = Double.parseDouble(aInput);
        Double b = Double.parseDouble(bInput);
        srednee = (sqrt(a * b));
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }
}