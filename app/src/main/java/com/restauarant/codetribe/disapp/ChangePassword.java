package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.restauarant.codetribe.disapp.R;

public class ChangePassword extends AppCompatActivity {

    Button changeData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        changeData = (Button) findViewById(R.id.btnChangePass);
        changeData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ChangePassword.this, MainActivity.class);
                startActivity(i);
                Toast.makeText(getBaseContext(),"Password Successfully Changed",Toast.LENGTH_LONG).show();
            }
        });

    }
}
