package com.nishan.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_android;
    ImageView img_android;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_android=findViewById(R.id.txt_android);
        img_android=findViewById(R.id.img_amdroid);
        txt_android.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Animation rotate=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                txt_android.startAnimation(rotate);

            }
        });
        img_android.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation rotate=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                img_android.startAnimation(rotate);
            }
        });
txt_android.setOnLongClickListener(new View.OnLongClickListener() {
    public boolean onLongClick(View v) {
        txt_android.clearAnimation();
        return true;
    }
});
        img_android.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                img_android.clearAnimation();
                return true;
            }
        });

    }

}
