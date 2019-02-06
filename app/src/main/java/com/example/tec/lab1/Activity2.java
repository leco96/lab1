package com.example.tec.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button buttonReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        buttonReturn = (Button) findViewById(R.id.buttonRegresar);
        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReturnMenu();
            }
        });

    }

    public void ReturnMenu(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
