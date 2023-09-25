package com.example.menuandroidfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.quanlynguoichoi) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameforfragment, QuanlynguoichoiFragment.newInstance("", ""))
                    .commit();
            return true;
        } else if (itemId == R.id.xembxh) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameforfragment, XembxhFragment.newInstance("", ""))
                    .commit();

        }

        return true;
    }
}