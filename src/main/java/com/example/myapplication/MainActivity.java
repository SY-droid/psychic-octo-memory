package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //
    TextView buttonView;
    TextView jap_buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add
        buttonView = findViewById(R.id.hellow);
        findViewById(R.id.button).setOnClickListener(click);

        // Add
        jap_buttonView = findViewById(R.id.hellow);
        findViewById(R.id.button2).setOnClickListener(jap_click);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    C:\Users\yuuit\AndroidStudioProjects\MyApplication3\app\src\main\java\com\example\myapplication\MainActivity.java
    // Add
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttonView.setText("World!");
        }
    };
    View.OnClickListener jap_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttonView.setText("世界");
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
