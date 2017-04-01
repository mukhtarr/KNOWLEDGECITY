package com.example.mukhtar.knowledgecity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         spinner = (Spinner) findViewById(R.id.spinner);
         Button button = (Button) findViewById(R.id.button);

        String[] sem = {"SEMESTER I","SEMESTER II","SEMESTER III","SEMESTER IV","SEMESTER V","SEMESTER VI","SEMESTER VII","SEMESTER VIII"};

        spinner.setPrompt("sem");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,sem);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,sem));
        spinner.setAdapter(adapter);



       }
}
