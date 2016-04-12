package com.doth.listsampleview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            TextView titleText = (TextView)findViewById(R.id.title_text);
            titleText.setText(getString(R.string.app_name));
            Button goButton = (Button)findViewById(R.id.go_button);
            goButton.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, NextActivity.class);
        // i(((TextView) findViewById(R.id.title_text)).getText());
        Log.e("@@@@@textaa", (String) ((TextView) findViewById(R.id.title_text)).getText());
        intent.putExtra("titleText", ((TextView) findViewById(R.id.title_text)).getText());
        startActivity(intent);
    }
}