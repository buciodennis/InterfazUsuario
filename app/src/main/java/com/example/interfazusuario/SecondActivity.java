package com.example.interfazusuario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.result.ActivityResult;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText txtNombre;
    EditText txtTelefono;
    EditText txtEmail;
    EditText txtContraseña;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }

    public void guardar_onClick(View v){
        txtNombre = findViewById(R.id.txtNombre);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtEmail = findViewById(R.id.txtEmail);
        txtContraseña = findViewById(R.id.txtContraseña);

        Usuario usuario = new Usuario(txtNombre.getText().toString(),Integer.parseInt(txtTelefono.getText().toString()),
                txtEmail.getText().toString(),txtContraseña.getText().toString() );

        Bundle bundle = new Bundle();
        bundle.putSerializable("usuario",usuario);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);

        finish();

    }

    public void cancelar_onClick(View v){
        super.onBackPressed();
    }


}

