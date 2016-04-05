package com.doth.listsampleview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titleText = (TextView)findViewById(R.id.title_text);
        titleText.setText(getString(R.string.app_name));

    }
}
