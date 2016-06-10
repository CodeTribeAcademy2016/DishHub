package com.restauarant.codetribe.disapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by CodeTribe1 on 2016-03-22.
 */
public class   HomeActivity extends AppCompatActivity {

    Button log,reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        log = (Button)findViewById(R.id.btnLogin);
        reg = (Button)findViewById(R.id.btnRegister);

        log.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"Sign in", Toast.LENGTH_LONG).show();
            }
        });

        reg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(HomeActivity.this, Register.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"Sign up", Toast.LENGTH_LONG).show();
            }
        });
    }
}