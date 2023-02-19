package com.example.game_tutorial;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class CharacterSprite {
    private Bitmap image;
    private int x;
    private int y;
    private int xVel;
    private int yVel;
    private final int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private final int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    public CharacterSprite(Bitmap bmp) {
        image = bmp;
        x = 100;
        y = 100;
        xVel = 10;
        yVel = 5;
    }

    public void draw (Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

    public void update() {
        x += xVel;
        y += yVel;
        if ((x >= (screenWidth - image.getWidth())) || x == 0 ) {
            xVel*= -1;
        }
        if ((y >= (screenHeight - image.getHeight())) || y == 0) {
            yVel*= -1;
        }
    }
}
