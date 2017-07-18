package com.example.a8308_04.mymission01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    Button btnUp;
    Button btnDown;

    //0이면 위, 1이면 아래
    static final int UP = 0;
    static final int DOWN = 1;
    int location = UP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUp = (Button) findViewById(R.id.btnUp);
        btnDown = (Button) findViewById(R.id.btnDown);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

    }

    public void btnUp (View v) {
        if (location == DOWN) { //아래 있으면, 위로 보낸다.
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            location = UP;
            btnUp.setEnabled(false);
            btnDown.setEnabled(true);
        }
    }

    public void btnDown (View v) {
        if (location == UP) { //위에 있으면, 아래로 보낸다.
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            location = DOWN;
            btnUp.setEnabled(true);
            btnDown.setEnabled(false);
        }
    }
}
