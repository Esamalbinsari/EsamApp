package com.example.esamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText TextView3;
    TextView TextView4;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView3 = findViewById(R.id.TextView3);
        TextView4 = findViewById(R.id.TextView4);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( TextView3.getText().toString().isEmpty())
                {
                    TextView4.setText("الرجاء كتابة رقم" );
                }
                else
                    {
                    StringBuilder stringBuilder = new StringBuilder();
                    int decimal = Integer.parseInt(TextView3.getText().toString());
                    if (decimal == 0)
                    {
                        TextView4.setText("0");
                    } 
                    else 
                    {
                        while (decimal > 0)
                        {
                            stringBuilder.append(decimal % 2);
                            decimal = decimal / 2;
                        }
                        TextView4.setText(stringBuilder.reverse());
                    }
                }
            }
        });

    }
}
