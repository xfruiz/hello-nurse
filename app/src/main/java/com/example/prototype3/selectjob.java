package com.example.prototype3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectjob extends AppCompatActivity {

    public Button btnHospitalStaff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectjob);


        btnHospitalStaff = findViewById(R.id.btnHospitalStaff);
        btnHospitalStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChooseHospital();
            }
        });
    }
        public void openChooseHospital(){
            Intent open_choose_hospital = new Intent(selectjob.this, choosehospital.class);
            startActivity(open_choose_hospital);
    }


}