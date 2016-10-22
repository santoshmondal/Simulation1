package com.example.santosh.simulation1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String LOG_TAG = MainActivity.class.getName();
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {

            Button b = (Button) v;

            Log.i(LOG_TAG, (String) b.getText());
            Toast.makeText(this, b.getText(), Toast.LENGTH_SHORT).show();
        } else if(v.getId() == R.id.button2) {

            Button b = (Button) v;

            Log.i(LOG_TAG, (String) b.getText());
            Toast.makeText(this, b.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
