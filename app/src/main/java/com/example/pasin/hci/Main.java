package com.example.pasin.hci;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface fontAwesomeFont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        TextView fontAwesomeAndroidIcon = (TextView) findViewById(R.id.font_awesome_android_icon);
        fontAwesomeAndroidIcon.setTypeface(fontAwesomeFont);

        Button fontAwesomeGoogle = (Button) findViewById(R.id.google);
        fontAwesomeGoogle.setTypeface(fontAwesomeFont);

        Button fontAwesomeFacebook = (Button) findViewById(R.id.facebook);
        fontAwesomeFacebook.setTypeface(fontAwesomeFont);

    }

    public void loginwithfacebook(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
