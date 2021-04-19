package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    String str1="";
    String str2="";
    RadioButton r1,r2,r3,r4,r5;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.rb1);
        r2=findViewById(R.id.rb2);
        r3=findViewById(R.id.rs);
        r4=findViewById(R.id.rl);
        r5=findViewById(R.id.ro);
        tv1=findViewById(R.id.hoteltype);
        r1.setOnClickListener(radioListener1);
        r2.setOnClickListener(radioListener1);
        r3.setOnClickListener(radioListener2);
        r4.setOnClickListener(radioListener2);
        r5.setOnClickListener(radioListener2);
    }
    private OnClickListener radioListener1=new OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton rb=(RadioButton) v;
            str1="the selected hotel type is:"+ rb.getText();
            tv1.setText(str1+"\n"+str2);

        }
    };
    private OnClickListener radioListener2=new OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton rb=(RadioButton) v;
            str2="the selected hotel type is:"+ rb.getText();
            tv1.setText(str1+"\n"+str2);

        }
    };
}