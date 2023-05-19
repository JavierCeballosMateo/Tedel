package com.example.tedel.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tedel.R;

public class RegisterActivity extends Activity {

    private EditText username;
    private EditText password;
    private EditText confirmPassword;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        username = findViewById(R.id.registerUsername);
        password = findViewById(R.id.registerPassword);
        confirmPassword = findViewById(R.id.confirmPassword);
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textUsername = username.getText().toString();
                String textPassword = password.getText().toString();
                String textConfirmPassword = confirmPassword.getText().toString();

                if(checkRegister(textUsername,textPassword,textConfirmPassword)){
                    Toast.makeText(RegisterActivity.this, "Registrado con éxito", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(RegisterActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean checkRegister(String textUsername, String textPassword, String textConfirmPassword){
        //Verifico si la contraseña y el confirmarContraseña coinciden
        return textPassword.equals(textConfirmPassword);
    }
}
