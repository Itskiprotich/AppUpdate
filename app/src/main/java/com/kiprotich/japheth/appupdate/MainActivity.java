package com.kiprotich.japheth.appupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kiprotich.japheth.update.CheckUpdate;
import com.kiprotich.japheth.update.Config;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkUpdate(View view) {
        Intent intent = new Intent(MainActivity.this, CheckUpdate.class);
        intent.putExtra(Config.BUILD_URL, BuildConfig.APPLICATION_ID);
        startActivity(intent);
        MainActivity.this.finish();

    }
}
