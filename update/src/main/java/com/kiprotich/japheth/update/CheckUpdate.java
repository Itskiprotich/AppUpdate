package com.kiprotich.japheth.update;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckUpdate extends AppCompatActivity {

    Button button;
    TextView textView;
    String app_link, complete_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_update);

        button = findViewById(R.id.update);
        textView = findViewById(R.id.close);
        app_link = getIntent().getStringExtra(Config.BUILD_URL);

        if (app_link != null) {
            complete_url = Config.GOOGLE_URL + app_link;
        }
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckUpdate.this.finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse(Config.MARKET_URL + "" + app_link)));
                } catch (android.content.ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse(complete_url)));
                }
                CheckUpdate.this.finish();
            }
        });
    }
}
