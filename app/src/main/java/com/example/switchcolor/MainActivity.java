package com.example.switchcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    Button button;
    int control = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        relativeLayout = findViewById(R.id.relativeLayout);

        relativeLayout.setBackgroundColor(Color.RED);
        button.setBackgroundColor(Color.BLUE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(255),random.nextInt(255),random.nextInt(255));
                //Task Bronze: change the color of button as well
                //relativeLayout.setBackgroundColor(color);
                //button.setBackgroundColor(color);

                // Task Silver: When you pressed the button, background color changes to green and button color changes to blue
                //relativeLayout.setBackgroundColor(Color.GREEN);
                //button.setBackgroundColor(Color.BLUE);

                // Task Gold: Initially, the color of background is read and button color is blue.
                //When button is pressed, background changes to blue and button to red. This operation
                // is repeated and color will be switched

                if (control % 2 == 0) {
                    relativeLayout.setBackgroundColor(Color.BLUE);
                    button.setBackgroundColor(Color.RED);
                }
                else if (control % 2 == 1) {
                    relativeLayout.setBackgroundColor(Color.RED);
                    button.setBackgroundColor(Color.BLUE);
                }
                control++;
            }
        });
    }
}