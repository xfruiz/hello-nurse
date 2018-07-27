package com.example.prototype3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class enterpassword extends AppCompatActivity {
    private Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterpassword);

        enterButton = (Button) findViewById(R.id.EnterButton);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectJob();
            }
        });
    }
    public void openSelectJob() {
        Intent intent = new Intent(this, selectjob.class);
        startActivity(intent);
    }
}
