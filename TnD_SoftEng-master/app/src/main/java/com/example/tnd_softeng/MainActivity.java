package com.example.tnd_softeng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tnd_softeng.ui.login.LoginActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class MainActivity extends AppCompatActivity {

    TextInputEditText textInputEditTextemail, textInputEditTextpassword;
    Button buttonLogin;
    TextView textViewSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);

        textInputEditTextemail = findViewById(R.id.emaillogin);
        textInputEditTextpassword = findViewById(R.id.passwordlogin);
        buttonLogin = findViewById(R.id.login);
        textViewSignup = findViewById(R.id.signup);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name, email, password;
                email = String.valueOf(textInputEditTextemail.getText());
                password = String.valueOf(textInputEditTextpassword.getText());

                if (!email.equals("") && !password.equals("") ) {

                    //Start ProgressBar first (Set visibility VISIBLE)
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[2];
                            field[0] = "email";
                            field[1] = "password";
                            //Creating array for data
                            String[] data = new String[2];
                            data[0] = "email";
                            data[1] = "password";
                            PutData putData = new PutData("https://192.168.1.61/TnD_SoftEng/Login-Register/login.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    if(result.equals("Login Success")){
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                    else{
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(getApplicationContext(),"All fields requiered!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void OpenSignupPage(View view) {
        startActivity(new Intent(MainActivity.this,SignupActivity.class));
    }
}