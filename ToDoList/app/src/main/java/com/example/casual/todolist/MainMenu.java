package com.example.casual.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button bt1 = (Button)findViewById(R.id.nova);
        Button bt2 = (Button)findViewById(R.id.pregled);
        Button bt3 = (Button)findViewById(R.id.pretekle);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, NovaNaloga.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, PregledNalog.class);
                startActivity(intent);

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, PretekleNaloge.class);
                startActivity(intent);
            }
        });
    }
}
