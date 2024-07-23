package com.ratna.memegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView memeOne, memeTwo, memeThree, memeFour, memeFive, memeSix, memeSeven, memeEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        memeOne = findViewById(R.id.memeOne);
        memeTwo = findViewById(R.id.memeTwo);
        memeThree = findViewById(R.id.memeThree);
        memeFour = findViewById(R.id.memeFour);
        memeFive = findViewById(R.id.memeFive);
        memeSix = findViewById(R.id.memeSix);
        memeSeven = findViewById(R.id.memeSeven);
        memeEight = findViewById(R.id.memeEight);

        memeOne.setOnClickListener(view -> {
            gotoGenerateMemeScreen(1);
        });

        memeTwo.setOnClickListener(view -> {
            gotoGenerateMemeScreen(2);
        });

        memeThree.setOnClickListener(view -> {
            gotoGenerateMemeScreen(3);
        });

        memeFour.setOnClickListener(view -> {
            gotoGenerateMemeScreen(4);
        });

        memeFive.setOnClickListener(view -> {
            gotoGenerateMemeScreen(5);
        });

        memeSix.setOnClickListener(view -> {
            gotoGenerateMemeScreen(6);
        });

        memeSeven.setOnClickListener(view -> {
            gotoGenerateMemeScreen(7);
        });

        memeEight.setOnClickListener(view -> {
            gotoGenerateMemeScreen(8);
        });


    }

    private void gotoGenerateMemeScreen(int name) {
        Intent intent = new Intent(this, MemeGenerator.class);
        intent.putExtra("drawableName", "meme" + name);
        startActivity(intent);
    }
}