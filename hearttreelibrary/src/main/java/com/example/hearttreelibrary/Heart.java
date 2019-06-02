package com.example.hearttreelibrary;

import android.graphics.Path;

public class Heart {
    private static final Path PATH = new Path();
    private static final float SCALE_FACTOR = 10f;
    private static final float RADIUS = 18 * SCALE_FACTOR;

    static {
        //x = 16sin^3t
        //y = 13cos t -5 cos 2t -2 cos 3t - cos 4t
        int n = 100;
        Point[] points = new Point[100];
        float t = 0f;
        float dt = (float) (2 * Math.PI / (n - 1));
        for (int i = 0; i < n; i++) {
            //pow(x,3) x的立方
            float x = (float) (16 * Math.pow(Math.sin(t), 3));
            float y = (float) (13 * Math.cos(t) - 5 * Math.cos(2 * t) - 2 * Math.cos(3 * t) - Math.cos(4 * t));
            points[i] = new Point(x * SCALE_FACTOR, -y * SCALE_FACTOR);
            t += dt;
            if (i == 0) {
                PATH.moveTo(points[0].x, points[0].y);
            } else {
                //连接路径
                PATH.lineTo(points[i].x, points[i].y);
            }
        }
        PATH.close();
    }

    public static Path getPath() {
        return PATH;
    }

    public static float getRadius() {
        return RADIUS;
    }
}
