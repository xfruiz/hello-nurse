package com.example.prototype3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectjob extends AppCompatActivity {
    private Button buttonHospitalStaffscript;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectjob);

        buttonHospitalStaffscript = findViewById(R.id.buttonHospitalStaff);
        buttonHospitalStaffscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChooseHospital();
            }
        });
    }
    public void openChooseHospital(){
        Intent open_choose_hospital = new Intent(this, choosehospital.class);
        startActivity(open_choose_hospital);
    }
}