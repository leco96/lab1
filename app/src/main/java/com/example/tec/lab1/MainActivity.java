package com.example.tec.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button buttonPlay;
    private EditText myName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlay = (Button) findViewById(R.id.buttonPlay);
        myName = findViewById(R.id.editText);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,target_activity.class);
                String nameTosend = myName.getText().toString() ;
                intent.putExtra("dat01",nameTosend);
                startActivity(intent);
            }
        });

    }


}
