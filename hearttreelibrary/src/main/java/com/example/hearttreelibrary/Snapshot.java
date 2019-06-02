package com.example.hearttreelibrary;

import android.graphics.Bitmap;
import android.graphics.Canvas;

//快照
public class Snapshot {
    Canvas canvas;
    Bitmap bitmap;

    Snapshot(Bitmap bitmap){
        this.bitmap = bitmap;
        this.canvas = new Canvas(bitmap);
    }
}
