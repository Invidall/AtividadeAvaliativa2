package br.com.juliocesar.atividadeavaliativa2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageLogo = findViewById(R.id.imageLogo);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        TextView textViewForgotPassword = findViewById(R.id.textViewForgotPassword);
        TextView textViewSignUp = findViewById(R.id.textViewSignUp);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                // Por enquanto, vamos apenas exibir uma mensagem de toast
                Toast.makeText(MainActivity.this, "Email: " + email + "\nSenha:" + password, Toast.LENGTH_SHORT).show();
            }
        });

        textViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lógica para lidar com a recuperação de senha aqui
                Toast.makeText(MainActivity.this, "Esqueceu a senha não disponível", Toast.LENGTH_SHORT).show();
            }
        });

        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lógica para lidar com o cadastro de novo usuário aqui
                Toast.makeText(MainActivity.this, "Cadastro não disponível", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
