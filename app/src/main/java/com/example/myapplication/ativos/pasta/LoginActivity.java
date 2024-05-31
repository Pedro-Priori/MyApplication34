package com.example.myapplication.ativos.pasta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {
private EditText userEdt,passEdt;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }
    private void initView(){
    userEdt = findViewById(R.id.editTextText);
    passEdt = findViewById(R.id.editTextTextPassword);
    }
    private void setVariable(){
        loginBtn.setOnClickListener(new View.OnContextClickListener(){
           @Override
           public void Onclick(View v) {
               if (userEdt.getText().toString().isEmpty()||passEdt.getText().toString().isEmpty()){
                   Toast.makeText(LoginActivity.this, "Por favor preencha o formulário de login", Toast.LENGTH_SHORT).show();
               } else if (userEdt.getText().toString().equals("admin")&& passEdt.getText().toString().equals("admin")) {
                   startActivities(new Intent(LoginActivity.this));
               }
           }
        });
    }
}
