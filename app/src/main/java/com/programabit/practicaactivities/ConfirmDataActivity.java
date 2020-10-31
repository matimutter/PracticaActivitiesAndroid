package com.programabit.practicaactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ConfirmDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_data);

        Bundle parametros = getIntent().getExtras();
        String nombre   = parametros.getString(getResources().getString(R.string.var_name));
        String fecha    = parametros.getString(getResources().getString(R.string.var_birth));
        String tel      = parametros.getString(getResources().getString(R.string.var_tel));
        String email    = parametros.getString(getResources().getString(R.string.var_email));
        String descr    = parametros.getString(getResources().getString(R.string.var_descr));

        TextView tvNombre   = (TextView) findViewById(R.id.text_confirm_name);
        TextView tvFecha    = (TextView) findViewById(R.id.text_confirm_date);
        TextView tvTel      = (TextView) findViewById(R.id.text_confirm_tel);
        TextView tvEmail    = (TextView) findViewById(R.id.text_confirm_email);
        TextView tvDescr    = (TextView) findViewById(R.id.text_confirm_description);

        tvNombre.setText(nombre);
        tvFecha.setText((getString(R.string.form_birth) + ": " + fecha));
        tvTel.setText((getString(R.string.form_tel_abrev) + " " + tel));
        tvEmail.setText((getString(R.string.form_email) + ": " + email));
        tvDescr.setText((getString(R.string.form_description) + ": " + descr));

    }


    public void goEditData(View view) {
        finish();
    }
}