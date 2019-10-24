package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView)findViewById(R.id.textview);
        button = (Button)findViewById(R.id.button);
        datePicker = (DatePicker)findViewById(R.id.datepicker);


        textView.setText("Current Date : " +getCurrentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Current Date : "+ getCurrentDate());
            }
        });

    }

    public String getCurrentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((datePicker.getMonth()+1+"/"));
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();
    }
}
