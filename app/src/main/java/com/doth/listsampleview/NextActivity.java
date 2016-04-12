package com.doth.listsampleview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NextActivity extends Activity implements View.OnClickListener {

    EditText nameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        if (savedInstanceState == null) {
            nameEdit = (EditText)findViewById(R.id.name_edit);

            String title = getIntent().getStringExtra("titleText");
            nameEdit.setText(title);
            Button clearBtn = (Button)findViewById(R.id.clear_edit_button);
            clearBtn.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (nameEdit != null) {
            nameEdit.setText("");
        }
    }
}