package com.example.interfazusuario;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent intent = result.getData();

                        Bundle objeto = intent.getExtras();
                        Usuario usuario;
                        usuario= (Usuario) objeto.getSerializable("usuario");
                        String nombre= usuario.getNombre().toString();
                        Toast.makeText(getApplicationContext(), "Usuario "+ nombre+" creado", Toast.LENGTH_SHORT).show();

                    }
                }
            });

    public void registrar_onClick(View v){
        mStartForResult.launch(new Intent(this, SecondActivity.class));
    }
}

