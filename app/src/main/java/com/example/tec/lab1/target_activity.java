package com.example.tec.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class target_activity extends AppCompatActivity {

        TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_activity);

        recibirDatos();
    }
    public void recibirDatos(){
        Bundle extra = getIntent().getExtras();
        String dato = extra.getString("dat01");
        myTextView = (TextView) findViewById(R.id.my_text);
        myTextView.setText(dato);
    }
}
