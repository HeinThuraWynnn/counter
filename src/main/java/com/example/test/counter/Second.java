package com.example.test.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 1/12/2017.
 */
public class Second extends AppCompatActivity {
    TextView textView2;
    Button button2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);
        textView2= (TextView) findViewById(R.id.textView2);
        button2= (Button) findViewById(R.id.button2);
        textView2.setText("This is 2nd Page");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(getApplicationContext(),"Go to 1st",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
