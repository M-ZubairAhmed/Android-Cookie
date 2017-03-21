package com.mastermindapps.androidcookie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean cookieThere = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView cookieImage = (ImageView) findViewById(R.id.cookie_image);
        final Button eatButton = (Button) findViewById(R.id.eat_button);
        eatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cookieThere){
                    cookieImage.setImageResource(R.drawable.after_cookie);
                    eatButton.setText(R.string.another_cookie);
                    cookieThere = false;
                }
                else {
                    cookieImage.setImageResource(R.drawable.before_cookie);
                    eatButton.setText(R.string.eat_cookie);
                    cookieThere = true;
                }
            }
        });
    }
}
