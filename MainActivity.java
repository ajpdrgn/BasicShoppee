package com.example.midterms_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.login_button);
        Credentials creds = new Credentials();



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().toString().equals(creds.getUsername())&&password.getText().toString().equals(creds.getPassword()))
                {
                    Intent next = new Intent(MainActivity.this, Shoppee.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Incorrect password or username.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}