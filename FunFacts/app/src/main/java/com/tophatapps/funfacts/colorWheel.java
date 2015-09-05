package com.tophatapps.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by TopHatMan on 9/5/15.
 */
public class ColorWheel {
    public String[] mColor = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    public int getColor(){
        //button was clicked add new fact

        String color = "";
        //randomly select fact
        Random randomGenerator = new Random(); // construct a new random generator
        int randomNumber = randomGenerator.nextInt(mColor.length);

        color = mColor[randomNumber];
        int colorasint = Color.parseColor(color);
        return colorasint;
    }
}
