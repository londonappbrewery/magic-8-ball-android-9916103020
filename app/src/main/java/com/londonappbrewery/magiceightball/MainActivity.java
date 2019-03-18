package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button predict;
        predict = (Button) findViewById(R.id.predict);

        final ImageView predict_image = (ImageView) findViewById(R.id.image_pred1);

        final int[] predArray = {
                R.drawable.pred1,
                R.drawable.pred2,
                R.drawable.pred3,
                R.drawable.pred4
        };

        predict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(4);

                predict_image.setImageResource(predArray[number]);
            }
        });
    }
}
