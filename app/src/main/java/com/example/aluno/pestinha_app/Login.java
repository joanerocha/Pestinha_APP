package com.example.aluno.pestinha_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {
    private Button mBtn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bindViews();
        setListeners();
    }

    private void bindViews() {
        mBtn_login = (Button) findViewById(R.id.btn_login);
    }

    private void setListeners() {
        mBtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                Bundle parans;
                intent = new Intent(getApplicationContext(), PropriedadesActivity.class);
                parans = new Bundle();
                intent.putExtras(parans);
                startActivity(intent);
            }
        });
    }
}
