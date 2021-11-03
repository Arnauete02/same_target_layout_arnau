package com.example.same_target_layout_arnau;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CardViewActivity extends AppCompatActivity {

    private int saber_click = 0;

    private TextView textTitle;
    private ImageView charImage;
    private TextView charName;
    private TextView charSide;
    private TextView cardSpecies;
    private TextView charLongText;
    private ImageView imageGiant;
    private ImageView saberImage;

    ObjectAnimator objectAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        textTitle = findViewById(R.id.textTitle);
        charImage = findViewById(R.id.charImage);
        charName = findViewById(R.id.charName);
        charSide = findViewById(R.id.charSide);
        cardSpecies = findViewById(R.id.cardSpecies);
        charLongText = findViewById(R.id.charLongText);
        imageGiant = findViewById(R.id.imageGiant);
        saberImage = findViewById(R.id.saberImage);

        Intent i = getIntent();

        String sTextTitle = i.getStringExtra(MainActivity.CHAR_TITLE);
        int iCharImage = i.getIntExtra(MainActivity.CHAR_IMAGE, 0);
        String sCharName = i.getStringExtra(MainActivity.CHAR_NAME);
        String sCharSide = i.getStringExtra(MainActivity.CHAR_SIDE);
        String sCardSpecies = i.getStringExtra(MainActivity.CHAR_SPECIES);
        String sCharLongText = i.getStringExtra(MainActivity.CHAR_LONG_TEXT);
        int iImageGiant = i.getIntExtra(MainActivity.IMAGE_GIANT, 0);
        int iSaberImage = i.getIntExtra(MainActivity.SABER_IMAGE, 0);

        textTitle.setText(sTextTitle);
        charImage.setImageResource(iCharImage);
        charName.setText(sCharName);
        charSide.setText(sCharSide);
        cardSpecies.setText(sCardSpecies);
        charLongText.setText(sCharLongText);
        imageGiant.setImageResource(iImageGiant);
        saberImage.setImageResource(iSaberImage);

        saberImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (saber_click == 0){
                    objectAnimator = ObjectAnimator.ofFloat(saberImage, "alpha", 0, 1);
                    objectAnimator.setDuration(500);

                    saber_click++;
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(saberImage, "alpha", 1, 0);
                    objectAnimator.setDuration(500);

                    saber_click = 0;
                }
                objectAnimator.start();
            }
        });
    }
}
