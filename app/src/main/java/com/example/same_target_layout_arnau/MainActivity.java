package com.example.same_target_layout_arnau;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static String CHAR_TITLE = "com.example.same_target_layout_arnau.CHAR_TITLE";
    public static String CHAR_IMAGE = "com.example.same_target_layout_arnau.CHAR_IMAGE";
    public static String CHAR_NAME = "com.example.same_target_layout_arnau.CHAR_NAME";
    public static String CHAR_SIDE = "com.example.same_target_layout_arnau.CHAR_SIDE";
    public static String CHAR_SPECIES = "com.example.same_target_layout_arnau.CHAR_SPECIES";
    public static String CHAR_LONG_TEXT = "com.example.same_target_layout_arnau.CHAR_LONG_TEXT";
    public static String IMAGE_GIANT = "com.example.same_target_layout_arnau.IMAGE_GIANT";
    public static String SABER_IMAGE = "com.example.same_target_layout_arnau.SABER_IMAGE";

    private CardView card1;
    private CardView card2;
    private CardView card3;
    private CardView card4;
    private CardView card5;
    private CardView card6;
    private CardView card7;
    private CardView card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);
        card7 = findViewById(R.id.card7);
        card8 = findViewById(R.id.card8);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.textChar1);
                int image = R.drawable.char1_f;
                String name = getString(R.string.textChar1);
                String side = getString(R.string.charSide1);
                String species = getString(R.string.cardSpecies1);
                String long_text = getString(R.string.charLongText1);
                int image_giant = R.drawable.char1_image;
                int saber_image = R.drawable.red_lightsaber;

                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);

                intent.putExtra(CHAR_TITLE, title);
                intent.putExtra(CHAR_IMAGE, image);
                intent.putExtra(CHAR_NAME, name);
                intent.putExtra(CHAR_SIDE, side);
                intent.putExtra(CHAR_SPECIES, species);
                intent.putExtra(CHAR_LONG_TEXT, long_text);
                intent.putExtra(IMAGE_GIANT, image_giant);
                intent.putExtra(SABER_IMAGE, saber_image);
                startActivity(intent);
            }
        });


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.textChar2);
                int image = R.drawable.char2_f;
                String name = getString(R.string.textChar2);
                String side = getString(R.string.charSide1);
                String species = getString(R.string.cardSpecies1);
                String long_text = getString(R.string.charLongText2);
                int image_giant = R.drawable.char2_image;
                int saber_image = R.drawable.red_lightsaber;

                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);

                intent.putExtra(CHAR_TITLE, title);
                intent.putExtra(CHAR_IMAGE, image);
                intent.putExtra(CHAR_NAME, name);
                intent.putExtra(CHAR_SIDE, side);
                intent.putExtra(CHAR_SPECIES, species);
                intent.putExtra(CHAR_LONG_TEXT, long_text);
                intent.putExtra(IMAGE_GIANT, image_giant);
                intent.putExtra(SABER_IMAGE, saber_image);
                startActivity(intent);
            }
        });


        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.textChar3);
                int image = R.drawable.char3_f;
                String name = getString(R.string.textChar3);
                String side = getString(R.string.charSide1);
                String species = getString(R.string.cardSpecies1);
                String long_text = getString(R.string.charLongText3);
                int image_giant = R.drawable.char3_image;
                int saber_image = R.drawable.red_lightsaber;

                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);

                intent.putExtra(CHAR_TITLE, title);
                intent.putExtra(CHAR_IMAGE, image);
                intent.putExtra(CHAR_NAME, name);
                intent.putExtra(CHAR_SIDE, side);
                intent.putExtra(CHAR_SPECIES, species);
                intent.putExtra(CHAR_LONG_TEXT, long_text);
                intent.putExtra(IMAGE_GIANT, image_giant);
                intent.putExtra(SABER_IMAGE, saber_image);
                startActivity(intent);
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.textChar4);
                int image = R.drawable.char4_f;
                String name = getString(R.string.textChar4);
                String side = getString(R.string.charSide1);
                String species = getString(R.string.cardSpecies2);
                String long_text = getString(R.string.charLongText4);
                int image_giant = R.drawable.char4_image;
                int saber_image = R.drawable.red_lightsaber;

                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);

                intent.putExtra(CHAR_TITLE, title);
                intent.putExtra(CHAR_IMAGE, image);
                intent.putExtra(CHAR_NAME, name);
                intent.putExtra(CHAR_SIDE, side);
                intent.putExtra(CHAR_SPECIES, species);
                intent.putExtra(CHAR_LONG_TEXT, long_text);
                intent.putExtra(IMAGE_GIANT, image_giant);
                intent.putExtra(SABER_IMAGE, saber_image);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.textChar5);
                int image = R.drawable.char5_f;
                String name = getString(R.string.textChar5);
                String side = getString(R.string.charSide2);
                String species = getString(R.string.cardSpecies3);
                String long_text = getString(R.string.charLongText5);
                int image_giant = R.drawable.char5_image;
                int saber_image = R.drawable.green_lightsaber;

                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);

                intent.putExtra(CHAR_TITLE, title);
                intent.putExtra(CHAR_IMAGE, image);
                intent.putExtra(CHAR_NAME, name);
                intent.putExtra(CHAR_SIDE, side);
                intent.putExtra(CHAR_SPECIES, species);
                intent.putExtra(CHAR_LONG_TEXT, long_text);
                intent.putExtra(IMAGE_GIANT, image_giant);
                intent.putExtra(SABER_IMAGE, saber_image);
                startActivity(intent);
            }
        });


        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.textChar6);
                int image = R.drawable.char6_f;
                String name = getString(R.string.textChar6);
                String side = getString(R.string.charSide2);
                String species = getString(R.string.cardSpecies4);
                String long_text = getString(R.string.charLongText6);
                int image_giant = R.drawable.char6_image;
                int saber_image = R.drawable.green_lightsaber;

                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);

                intent.putExtra(CHAR_TITLE, title);
                intent.putExtra(CHAR_IMAGE, image);
                intent.putExtra(CHAR_NAME, name);
                intent.putExtra(CHAR_SIDE, side);
                intent.putExtra(CHAR_SPECIES, species);
                intent.putExtra(CHAR_LONG_TEXT, long_text);
                intent.putExtra(IMAGE_GIANT, image_giant);
                intent.putExtra(SABER_IMAGE, saber_image);
                startActivity(intent);
            }
        });


        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.textChar7);
                int image = R.drawable.char7_f;
                String name = getString(R.string.textChar7);
                String side = getString(R.string.charSide2);
                String species = getString(R.string.cardSpecies1);
                String long_text = getString(R.string.charLongText7);
                int image_giant = R.drawable.char7_image;
                int saber_image = R.drawable.green_lightsaber;

                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);

                intent.putExtra(CHAR_TITLE, title);
                intent.putExtra(CHAR_IMAGE, image);
                intent.putExtra(CHAR_NAME, name);
                intent.putExtra(CHAR_SIDE, side);
                intent.putExtra(CHAR_SPECIES, species);
                intent.putExtra(CHAR_LONG_TEXT, long_text);
                intent.putExtra(IMAGE_GIANT, image_giant);
                intent.putExtra(SABER_IMAGE, saber_image);
                startActivity(intent);
            }
        });


        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.textChar8);
                int image = R.drawable.char8_f;
                String name = getString(R.string.textChar8);
                String side = getString(R.string.charSide2);
                String species = getString(R.string.cardSpecies5);
                String long_text = getString(R.string.charLongText8);
                int image_giant = R.drawable.char8_image;
                int saber_image = R.drawable.green_lightsaber;

                Intent intent = new Intent(MainActivity.this, CardViewActivity.class);

                intent.putExtra(CHAR_TITLE, title);
                intent.putExtra(CHAR_IMAGE, image);
                intent.putExtra(CHAR_NAME, name);
                intent.putExtra(CHAR_SIDE, side);
                intent.putExtra(CHAR_SPECIES, species);
                intent.putExtra(CHAR_LONG_TEXT, long_text);
                intent.putExtra(IMAGE_GIANT, image_giant);
                intent.putExtra(SABER_IMAGE, saber_image);
                startActivity(intent);
            }
        });
    }
}