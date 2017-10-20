package xaidworkz.canvasdraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyView myview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float defaultRatio = (float) 30 / (float) 100;
        myview = (MyView) findViewById(R.id.myview);
        myview.setShapeRadiusRatio(defaultRatio);
    }
}
