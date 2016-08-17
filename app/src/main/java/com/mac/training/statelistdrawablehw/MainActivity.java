package com.mac.training.statelistdrawablehw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button changeMe;
    private ImageView changeImage;
    private TextView currentImage;
    private int state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        state = 0;

        currentImage = (TextView) findViewById(R.id.currentview);

        changeImage = (ImageView) findViewById(R.id.changeimage);

        changeMe = (Button) findViewById(R.id.changeme);

        changeMe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch(state) {
                    case 0:
                        changeImage.setImageState(new int[] { android.R.attr.state_pressed }, true);
                        changeImage.refreshDrawableState();
                        currentImage.setText("1");
                        break;
                    case 1:
                        changeImage.setImageState(new int[] { android.R.attr.state_checked }, true);
                        changeImage.refreshDrawableState();
                        currentImage.setText("2");
                        break;
                    case 2:
                        changeImage.setImageState(new int[] { android.R.attr.state_active }, true);
                        changeImage.refreshDrawableState();
                        currentImage.setText("3");
                        break;
                    case 3:
                        changeImage.setImageState(new int[] { android.R.attr.state_activated }, true);
                        changeImage.refreshDrawableState();
                        currentImage.setText("4");
                        break;
                    default:
                        changeImage.setImageState(new int[] { android.R.attr.state_pressed }, true);
                        changeImage.refreshDrawableState();
                        currentImage.setText("0");
                        break;
                }
                state = (state + 1) % 4;
            }
        });

    }
}
