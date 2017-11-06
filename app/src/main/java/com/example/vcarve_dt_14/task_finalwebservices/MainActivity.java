package com.example.vcarve_dt_14.task_finalwebservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etContact, etCountry, etPassword;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText)findViewById(R.id.etName);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etContact = (EditText)findViewById(R.id.etContact);
        etCountry = (EditText)findViewById(R.id.etCountry);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnSave = (Button)findViewById(R.id.btnSave);

    }

    public void OnSaving(View view) {
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String contact = etContact.getText().toString();
        String country = etCountry.getText().toString();
        String password = etPassword.getText().toString();
        String type = "save";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, name, email, contact, country, password);
    }
}
