package com.restauarant.codetribe.disapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import android.os.Handler;
import java.util.logging.LogRecord;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.Constance;
import utils.OkHttp;

/**
 * Created by CodeTribe1 on 2016-03-22.
 */
public class MainActivity extends AppCompatActivity {

    private Button signUp;
    private  EditText editUsername;
    private EditText editPassword;
    private TextView forgot;
    Handler handler = new Handler(Looper.getMainLooper());




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUsername = (EditText) findViewById(R.id.username);
        editPassword = (EditText) findViewById(R.id.password);
        forgot = (TextView) findViewById(R.id.txtForgot);

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ForgotPassword.class);
                startActivity(i);
            }
        });

        signUp = (Button)findViewById(R.id.btnSignin);
       /* signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CustomerNavigation.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"Welcome",Toast.LENGTH_LONG).show();
                final String email = editUsername.getText().toString();
                if (!isValidEmail(email)) {
                    editUsername.setError("Invalid Username");

                }
                final String pass = editPassword.getText().toString();
                if (!isValidPassword(pass)) {
                    editPassword.setError("Invalid password");
                }

                if (editUsername != null && editPassword != null) {
                    Intent i = new Intent(MainActivity.this, CustomerNavigation.class);
                    startActivity(i);
                    Toast.makeText(getBaseContext(), "Welcome", Toast.LENGTH_LONG).show();
                }


            }
        });*/

    }

    public void login(View v)
    {

        String username = editUsername.getText().toString();
        String password = editPassword.getText().toString();

        String json_payload = "";
        Log.i("Helo",username);

        try
        {
            json_payload = new JSONObject()
                    .put(Constance.email, username)
                    .put(Constance.password,password)
                    .put(Constance.requestType,Constance.loginRequest).toString();

        }
        catch(Exception e)
        {

            e.printStackTrace();
        }
        final String json_pay = json_payload;
        final OkHttp okhttpObj = new OkHttp();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try
                {


                    Log.i("Helo",Constance.dishHubUrl);
                    Log.i("Helo",Constance.dishHubUrl+ "?JSON="+json_pay);
                    String res = okhttpObj.post(Constance.dishHubUrl + "?JSON=" + json_pay, json_pay);
                    final JSONObject jsonObject = new JSONObject(res.trim());
                    Log.i("Helo",res);
                    final String statusCode = jsonObject.getString("statuscode").toString();
                    String message = jsonObject.getString("message");
                    Log.i("Helo",message);

                    if(Integer.parseInt(statusCode) == 0)
                    {
                        Toast.makeText(getBaseContext(),"Login not successfully"+statusCode, Toast.LENGTH_LONG ).show();

                    }
                    else if(Integer.parseInt(statusCode) == 100)
                    {
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Toast.makeText(getBaseContext(), "Login successfully" + statusCode, Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(MainActivity.this, CustomerNavigation.class);
                                intent.putExtra("jsonObject", jsonObject.toString());
                                startActivity(intent);

                            }
                        },1000);


                    }
                }
                catch(Exception e)
                {

                    e.printStackTrace();
                }
            }
        });
        thread.start();


    }
   // editUsername.setText("");
    //editPassword.setText("");

    private boolean isValidEmail(String email)
    {

        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();


    }

    private boolean isValidPassword(String pass)
    {
        if(pass != null && pass.length() > 6)
        {
            return true;

        }
        return false;
    }
}