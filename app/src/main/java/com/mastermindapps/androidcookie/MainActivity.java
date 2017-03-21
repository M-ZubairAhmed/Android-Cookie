package com.mastermindapps.androidcookie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //boolean variable to keep track of cookie plate
    private boolean cookieThere = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing and getting reference to the background image.
        final ImageView cookieImage = (ImageView) findViewById(R.id.cookie_image);
        //Initializing and getting reference to the eat cookie button.
        final Button eatButton = (Button) findViewById(R.id.eat_button);
        //Attaching click listener to eat cookie button.
        eatButton.setOnClickListener(new View.OnClickListener() { //implementing View.OnClickListener interface
            //This interface have one abstract method onClick, we have to override and provide our own implementation.
            @Override
            public void onClick(View v) {
                if (cookieThere){
                    //Setting background image to picture of eaten cookie
                    cookieImage.setImageResource(R.drawable.after_cookie);
                    //Setting button text to one after eaten cookie picture is shown
                    eatButton.setText(R.string.another_cookie);
                    //boolean variable set to false so that next time this block should skip, and go to screen showing
                    //uneaten cookie
                    cookieThere = false;
                }
                else {
                    //Setting background image to picture of fresh cookie
                    cookieImage.setImageResource(R.drawable.before_cookie);
                    //Setting button text to one after new(un eaten) cookie picture is shown
                    eatButton.setText(R.string.eat_cookie);
                    //boolean variable set to false so that next time this block should skip, and go to screen showing eaten cookie
                    cookieThere = true;
                }
            }
        });
    }
}
