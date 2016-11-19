package com.example.casual.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PregledNalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregled_nalog);

        TextView naloga1 = (TextView)findViewById(R.id.naloga);
        TextView datum1 = (TextView)findViewById(R.id.datum);

        String ime_naloge = "";
        String datum = "";
        String interval ="";
        Boolean alarm;
        Boolean ponavljanje;

        final Intent intent = getIntent();
        if (intent != null) {
            final Bundle bundle = intent.getExtras();
            if (bundle != null) {

                ime_naloge = bundle.getString("ime");
                datum = bundle.getString("datum");
                interval = bundle.getString("interval");
                alarm = bundle.getBoolean("alarm");
                ponavljanje = bundle.getBoolean("ponavljanje");
            }
        }

        naloga1.setText(ime_naloge);
        datum1.setText(datum);

    }
}
