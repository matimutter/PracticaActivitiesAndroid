package com.programabit.practicaactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout textInputName;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputTel;
    private TextInputLayout textInputInfo;
    private DatePicker datePicker;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputName = findViewById(R.id.text_input_fullname);
        datePicker = findViewById(R.id.date_piker);
        textInputEmail = findViewById(R.id.text_input_email);
        textInputTel = findViewById(R.id.text_input_tel);
        textInputInfo = findViewById(R.id.text_input_info);
        buttonNext = findViewById(R.id.btn_next);
    }

    private boolean validateEmail() {
        String emailInput = textInputEmail.getEditText().getText().toString().trim();

        if (emailInput.isEmpty()) {
            textInputEmail.setError(getString(R.string.form_error));
            return false;
        } else {
            textInputEmail.setError(null);
            return true;
        }
    }

    private boolean validateName() {
        String emailInput = textInputName.getEditText().getText().toString().trim();

        if (emailInput.isEmpty()) {
            textInputName.setError(getString(R.string.form_error));
            return false;
        } else {
            textInputName.setError(null);
            return true;
        }
    }

    public void goNextActivity(View view) {
        if (!validateEmail() | !validateName()) {
            return;
        }

        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year = datePicker.getYear();

        Intent intent = new Intent(MainActivity.this, ConfirmDataActivity.class);
        intent.putExtra(getResources().getString(R.string.var_name), textInputName.getEditText().getText().toString());
        intent.putExtra(getResources().getString(R.string.var_birth), day + "/" + month + "/" + year);
        intent.putExtra(getResources().getString(R.string.var_tel), textInputTel.getEditText().getText().toString());
        intent.putExtra(getResources().getString(R.string.var_email), textInputEmail.getEditText().getText().toString());
        intent.putExtra(getResources().getString(R.string.var_descr), textInputInfo.getEditText().getText().toString());
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}