package com.example.activitystate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonIncrement;
    private Button nextAct;
    private TextView textViewer;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate");

        buttonIncrement = findViewById(R.id.button);
        nextAct = findViewById(R.id.button2);
        textViewer = findViewById(R.id.textView);

        buttonIncrement.setOnClickListener(this);
        textViewer.setText(String.valueOf(counter));

        nextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("cnt_val", counter);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy");
    }

    @Override
    public void onClick(View view) {
        counter++;
        textViewer.setText(String.valueOf(counter));
    }
}
