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

import org.json.JSONException;
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



        //http://localhost:8080/NsizwaRestaurant/rs?JSON={%22customer%22:{%22name%22:%22Tshigo%22,%22surname%22:%22Masilo%22,%22email%22:%22Tshigo@gmail.com%22,%22contact%22:%220785225567%22,%22address%22:%22543%20Ext%2004%20Highveld%20Park%20Hibron%202268%22,%22username%22:%22Misal%22,%22password%22:%22Tshigo@078%22,%22restuarantID%22:35},%22RequestType%22:20}
        //{%22customer%22:{%22name%22:%22Tshigo%22,%22surname%22:%22Masilo%22,%22email%22:%22Tshigo@gmail.com%22,%22contact%22:%220785225567%22,%22address%22:%22543%20Ext%2004%20Highveld%20Park%20Hibron%202268%22,%22username%22:%22Misal%22,%22password%22:%22Tshigo@078%22,%22restuarantID%22:35},%22RequestType%22:20}
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

        String json_customer = "";

        try {
            json_customer = new JSONObject()
                    .put(Constance.customer,  new JSONObject()
                            .put(Constance.name, name)
                            .put(Constance.surname,surname)
                            .put(Constance.email,email)
                            .put(Constance.contact,contact)
                            .put(Constance.address,address)
                            .put(Constance.username,username)
                            .put(Constance.password,password)
                            .put(Constance.restuarantId,restId))
                    .put(Constance.requestType, Constance.REGISTER_CUSTOMER).toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        final String customer_payload = json_customer;
        final String json_pay = json_customer;
        final OkHttp objHttp = new OkHttp();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try
                {
                    Log.i("Ygritte",json_pay);
                    Log.i("Ygritte",Constance.dishHubUrl+ "?JSON=" +customer_payload);
                    String res = objHttp.post(Constance.dishHubUrl+"?JSON="+customer_payload, customer_payload);
                    final JSONObject objJson = new JSONObject(res.trim());
                    Log.i("Ygritte","response : "+res);
                    final String statusCode = objJson.getString("statuscode").toString();
                    String message = objJson.getString("message");
                    Log.i("Ygritte", message);

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
