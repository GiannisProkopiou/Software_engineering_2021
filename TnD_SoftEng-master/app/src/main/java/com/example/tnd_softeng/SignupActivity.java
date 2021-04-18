package com.example.tnd_softeng;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class SignupActivity extends AppCompatActivity {

    TextInputEditText textInputEditTextname, textInputEditTextemail, textInputEditTextpassword;
    Button buttonSignup;
    TextView textViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        textInputEditTextname = findViewById(R.id.name);
        textInputEditTextemail = findViewById(R.id.email);
        textInputEditTextpassword = findViewById(R.id.password);
        buttonSignup = findViewById(R.id.signup);
        textViewLogin = findViewById(R.id.login);

        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name, email, password;
                name = String.valueOf(textInputEditTextname.getText());
                email = String.valueOf(textInputEditTextemail.getText());
                password = String.valueOf(textInputEditTextpassword.getText());

                if (!name.equals("") && !email.equals("") && !password.equals("") ) {

                    //Start ProgressBar first (Set visibility VISIBLE)
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[3];
                            field[0] = "name";
                            field[1] = "email";
                            field[2] = "password";
                            //Creating array for data
                            String[] data = new String[3];
                            data[0] = "name";
                            data[1] = "email";
                            data[2] = "password";
                            PutData putData = new PutData("https://192.168.1.61/TnD_SoftEng/Login-Register/signup.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    if(result.equals("Sign Up Success")){
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
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

    public void OpenSigninPage(View view) {
        startActivity(new Intent(SignupActivity.this,MainActivity.class));
    }
}