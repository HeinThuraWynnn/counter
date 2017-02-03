package com.example.test.counter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    TextView textView2;
    Button button2;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.button);
        textView= (TextView) findViewById(R.id.textView);
        textView2= (TextView) findViewById(R.id.textView2);
        textView2.setText("This Is The First Page ^_^ ");
        button2= (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText("Number You Click="+count);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Second.class);
                startActivity(it);
                Toast.makeText(getApplicationContext(),"Go to Second",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
