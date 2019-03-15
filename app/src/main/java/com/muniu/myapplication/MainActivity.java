package com.muniu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.muniu.myapplication.R;

public class MainActivity extends AppCompatActivity {
    EditText name, email, phone;
    Button save;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Sets the xml layout to this class

        name = (EditText)findViewById(R.id.nameEditText); //link the java variable to the xml id
        email = (EditText)findViewById(R.id.emailEditText);
        phone = (EditText) findViewById(R.id.phoneEditText);
        display = (TextView)findViewById(R.id.displayTextView);

        save = (Button)findViewById(R.id.saveButton);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myName, myEmail, myPhone;

                myName = name.getText().toString().trim();
                myEmail = email.getText().toString().trim();
                myPhone = phone.getText().toString().trim();

                {
                    if (myName.length() == 0 || myEmail.length() == 0 || myPhone.length() == 0)

                    {

                        Toast.makeText(MainActivity.this, "ensure all fields are set", Toast.LENGTH_LONG).show();
                    } else {

                        display.setText("The name is: " + myName + " and email is: " + myEmail + " and phone is: " + myPhone);
                    }
                }
            }
        });


    }
}

