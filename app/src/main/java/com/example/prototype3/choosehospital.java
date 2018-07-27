package com.example.prototype3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class choosehospital extends AppCompatActivity {

    Spinner hospitalSelectionSpinner = (Spinner) findViewById(R.id.chooseHospitalDropdown);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.hospital_choices, android.R.layout.simple_spinner_item);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosehospital);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hospitalSelectionSpinner.setAdapter(adapter);

    }
}
