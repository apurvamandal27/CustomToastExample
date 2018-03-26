package com.example.apurva.customtoastexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText et_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.btn_submit);
        et_name=findViewById(R.id.et_name);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast=Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT);

                //To use the other layout resources we need getLayoutInflater
                LayoutInflater layoutInflater=getLayoutInflater();
                View view=layoutInflater.inflate(R.layout.custom_toast_layout,null);

                TextView textView=view.findViewById(R.id.name);
                textView.setText(et_name.getText().toString());


                //set the Custom layout
                toast.setView(view);
                toast.show();


            }
        });
    }
}