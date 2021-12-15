package com.jerome.uktechians_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv_pp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initResources();
    }

    private void initResources() {
        iv_pp=(ImageView)findViewById(R.id.iv_pp);
        iv_pp=setImageResource(R.raw.iv_avatar2);

        findViewById(R.id.btn_submit).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NextActivity.class));
            }
        });
    }
}