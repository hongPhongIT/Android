package com.example.phongnguyen.listview;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    EditText edtUser, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtPassword = (EditText) findViewById(R.id.edit_password);
        edtUser = (EditText) findViewById(R.id.edit_user);
        btnLogin = (Button) findViewById(R.id.button_login);

        if (checkLogin()){
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtUser.getText().toString();
                String password = edtPassword.getText().toString();

                if (userName.equals("admin") && password.equals("12345")){
                    saveLogin();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "login successfully",Toast.LENGTH_LONG).show();
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, "login failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void saveLogin(){
        SharedPreferences loginData = getSharedPreferences("Login",MODE_PRIVATE);
        SharedPreferences.Editor editor =loginData.edit();
        editor.putString("username", edtUser.getText().toString());
        editor.commit();
    }

    private Boolean checkLogin(){
        SharedPreferences loginData = getSharedPreferences("Login",MODE_PRIVATE);
        String user = loginData.getString("username", "");
        if(user.equals("")) return false;
        return true;
    }
}
