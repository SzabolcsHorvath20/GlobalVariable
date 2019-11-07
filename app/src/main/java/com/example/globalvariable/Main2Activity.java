package com.example.globalvariable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public TextView tvnamedisplay;
    public Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first_activity = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(first_activity);
                finish();
            }
        });
    }

    public void init()
    {
        tvnamedisplay = findViewById(R.id.tvnamedisplay);
        btnback = findViewById(R.id.btnback);
    }
}
