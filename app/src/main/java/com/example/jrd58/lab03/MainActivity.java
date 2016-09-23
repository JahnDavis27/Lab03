package com.example.jrd58.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    //initializes variables
    private EditText passwordEdit;
    private TextView invalidPassword;
    private ImageView androidPose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finds necessary pieces
        passwordEdit = (EditText) findViewById(R.id.passwordEdit);
        invalidPassword = (TextView) findViewById(R.id.invalidPassword);
        androidPose = (ImageView) findViewById(R.id.androidPose);

        invalidPassword.setVisibility(View.INVISIBLE);
        androidPose.setVisibility(View.INVISIBLE);

        //Listener
        passwordEdit.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                //sets the password entry field to receive input and convert to string
                String password = passwordEdit.getText().toString();

                //Sets the image to be visible and hides error message
                if (password.equals("CoolSkeleton95")) {
                    invalidPassword.setVisibility(View.GONE);
                    androidPose.setVisibility(View.VISIBLE);
                    return true;
                }

                //Sets the error message to be visible and hides picture
                else {
                    androidPose.setVisibility(View.GONE);
                    invalidPassword.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
    }
}
