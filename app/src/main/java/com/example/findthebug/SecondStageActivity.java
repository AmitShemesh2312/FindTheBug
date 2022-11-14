package com.example.findthebug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondStageActivity extends AppCompatActivity implements View.OnClickListener {

    private String data;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_stage);
        Toast.makeText(this,"המורה זה לא עובד לי...", Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        data = intent.getExtras().toString();
    }


    @Override
    public void onClick(View view)
    {
        Intent intent = new Intent(this,ThirdStage.class);
        startActivity(intent);
    }

}