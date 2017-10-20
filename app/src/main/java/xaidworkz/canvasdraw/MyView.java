package xaidworkz.canvasdraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by xaidi on 20-10-2017.
 */

public class MyView extends View {
    Shaper myShape;
    float ratioRadius;

    public MyView(Context context) {
        super(context);
        initMyView();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initMyView();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initMyView();
    }

    private void initMyView() {
        myShape = new Shaper(3);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int h = getHeight();
        int w = getWidth();
        if ((w == 0) || (h == 0)) {
            return;
        }
        float x = (float) w / 2.0f;
        float y = (float) h / 2.0f;
        float radius;
        if (w > h) {
            radius = h * ratioRadius;
        } else {
            radius = w * ratioRadius;
        }
        myShape.setCircle(x, y, radius, Path.Direction.CCW);
        canvas.drawPath(myShape.getPath(), myShape.getPaint());
    }

    public void setShapeRadiusRatio(float ratio) {
        ratioRadius = ratio;
    }
}
