package com.example.dabin.www.day04_propetyview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Dabin on 2017/9/28.
 */

public class MyView extends View {
    private Bitmap bitmap;

    public MyView(Context context) {
        super(context);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        paint.setTextSize(30); // 设置字体大小

        canvas.drawText("This is a onDraw", 0, 30, paint); //设置字体

        canvas.drawLine(0, 60, 200, 60, paint); // 直线

        canvas.drawRect(0, 90, 200, 200, paint); //矩形   左 上 右 下

        canvas.drawBitmap(bitmap, 50, 250, paint); //位图

        super.onDraw(canvas);
    }
}
