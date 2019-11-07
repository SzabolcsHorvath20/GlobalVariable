package com.example.globalvariable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText etname;
    public Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second_activity = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(second_activity);
                finish();
            }
        });
    }
    public void init()
    {
        etname = findViewById(R.id.etname);
        btnsend = findViewById(R.id.btnsend);
    }
}
