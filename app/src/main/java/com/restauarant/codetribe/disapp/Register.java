package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import utils.Constance;
import utils.OkHttp;

/**
 * Created by CodeTribe1 on 3/22/2016.
 */
public class Register extends AppCompatActivity {

    private EditText edName,edSurname,edEmail,edContact,edAddress,edUsername,edPassword,edRestuarandID;
    Handler handler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edName = (EditText) findViewById(R.id.editName);
        edSurname = (EditText) findViewById(R.id.editSurname);
        edEmail = (EditText) findViewById(R.id.editEmail);
        edContact = (EditText) findViewById(R.id.editContact);
        edAddress = (EditText) findViewById(R.id.editAddress);
        edUsername = (EditText) findViewById(R.id.editUsername);
        edPassword = (EditText) findViewById(R.id.editPassword);
        edRestuarandID = (EditText) findViewById(R.id.editRestID);

        Button signUp = (Button) findViewById(R.id.btnSignUp);
        /*signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, HomeActivity.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(), "Successfully Registered...", Toast.LENGTH_LONG).show();
            }
        });*/




    }
    public void register(View v)
    {
        String name = edName.getText().toString();
        String surname = edSurname.getText().toString();
        String email = edEmail.getText().toString();
        String contact = edContact.getText().toString();
        String address = edAddress.getText().toString();
        String username = edUsername.getText().toString();
        String password = edPassword.getText().toString();
        String  restId = (edRestuarandID.getText().toString());

         String json_payload ="";
        Log.i("Hello",name);

        try
        {
            json_payload = new JSONObject()
                    .put(Constance.name,name)
                    .put(Constance.surname,surname)
                    .put(Constance.email,email)
                    .put(Constance.contact,contact)
                    .put(Constance.address,address)
                    .put(Constance.username,username)
                    .put(Constance.password,password)
                    .put(Constance.restuarantId,restId)
                    .put("}","}")
                    .put(Constance.requestType,Constance.REGISTER_CUSTOMER).toString();

        }
        catch(Exception e)
        {

            e.getStackTrace();
        }

        final String json_pay = json_payload;
        final OkHttp objHttp = new OkHttp();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try
                {
                    Log.i("Helo",Constance.dishHubUrl);
                    Log.i("Helo",Constance.dishHubUrl+ "?JSON" +json_pay);
                    String res = objHttp.post(Constance.dishHubUrl+"?JSON="+json_pay, json_pay);
                    final JSONObject objJson = new JSONObject(res.trim());
                    Log.i("Helo",res);
                    final String statusCode = objJson.getString("statuscode").toString();
                    String message = objJson.getString("message");
                    Log.i("Helo", message);

                    if(Integer.parseInt(statusCode) == 0)
                    {
                        Toast.makeText(getBaseContext(), "User not Registered!!"+statusCode , Toast.LENGTH_LONG).show();

                    }
                    else if(Integer.parseInt(statusCode) == 100)
                    {
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(getBaseContext(), "User Registered!!"+statusCode , Toast.LENGTH_LONG).show();
                                Intent i = new Intent(Register.this, MainActivity.class);
                                i.putExtra("objJson_",objJson.toString());
                                startActivity(i);

                            }
                        },1000);


                    }


                }
                catch(Exception e)
                {

                    e.getStackTrace();
                }
            }
        });
            thread.start();


    }
}
