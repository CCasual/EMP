package com.example.casual.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NovaNaloga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_naloga);

        Spinner dropdown = (Spinner)findViewById(R.id.cas_alarma);
        String[] items = new String[]{"0:00", "2", "three"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        final Spinner dropdown1 = (Spinner)findViewById(R.id.interval_ponavljanja);
        String[] cas = new String[]{"Vsak dan", "Do konca tedna", "Vsak ponedeljek", "Vsak torek", "Vsako sredo", "Vsak četrtek", "Vsak petek", "Vsako soboto", "Vsako nedeljo"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        final EditText ed1 = (EditText)findViewById(R.id.naloga);
        final EditText ed2 = (EditText)findViewById(R.id.editText);
        final CheckBox cb1 = (CheckBox)findViewById(R.id.Alarm);
        final CheckBox cb2 = (CheckBox)findViewById(R.id.PonavljanjeNaloge);

        Button shrani = (Button) findViewById(R.id.shrani);

        shrani.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String ime_naloge = ed1.getText().toString();
                String datum_naloge = ed2.getText().toString();
                Boolean alarm;
                Boolean ponavljanje;
                String interval = dropdown1.getSelectedItem().toString();

                if(cb1.isChecked()){

                    alarm = true;
                }
                else{

                    alarm = false;
                }

                if(cb2.isChecked()){

                    ponavljanje = true;
                }
                else{

                    ponavljanje = false;
                }

                Intent intent = new Intent(NovaNaloga.this, PregledNalog.class);
                Bundle bundle = new Bundle();
                bundle.putString("ime", ime_naloge);
                bundle.putString("datum", datum_naloge);
                bundle.putBoolean("alarm", alarm);
                bundle.putBoolean("ponavljanje", ponavljanje);
                bundle.putString("interval", interval);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }
}
