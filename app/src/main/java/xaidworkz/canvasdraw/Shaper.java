package xaidworkz.canvasdraw;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by xaidi on 20-10-2017.
 */

public class Shaper {

    private Paint paint;
    private Path path;

    public Shaper(int strokeWidth) {
        paint= new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(strokeWidth);
        paint.setStyle(Paint.Style.STROKE);
        path=new Path();
    }

    public void setCircle(float x, float y, float radius, Path.Direction dir){
        path.reset();
        path.addCircle(x,y,radius,dir);
        path.moveTo(20,20);
        path.lineTo(20,100);
        path.lineTo(100,200);
        path.lineTo(200,300);
        path.lineTo(300,400);
    }

    public Paint getPaint() {
        return paint;
    }

    public Path getPath() {
        return path;
    }
}
