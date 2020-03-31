package com.ShreeMarella.day1_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText edtName;
    private EditText edtPassword;
    private Button btnLogin;
    private TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtpassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtMessage = findViewById(R.id.txtMessage);

        btnLogin.setOnClickListener( new  View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
//               Toast t = Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG);
//               t.show();

                String name = edtName.getText().toString();
                Log.d("NAME", name);

                txtMessage.setText("LogIn Successful");

            }

        });

    }
}
