package com.example.iis5.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MyActivity extends AppCompatActivity {
    //created MyActivity

    EditText email, password;//initializing the variables of Edittexts and button
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        //creating view ids of xml for email,password and login
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.editText);
        login = (Button) findViewById(R.id.button);


        //creating onclicklistener for the button once creating
        // //if we click on login button it goes to the second screen of second activity
        //using bundle we are creating the intent for login screen
          login.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String name = email.getText().toString();//here String type will the text of email
                  Bundle bundle = new Bundle();//creating bundle
                  bundle.putString("name", name);//it puts the string value here
                  Intent i = new Intent(MyActivity.this, UserDetails.class);//creating intent obj for this class with the UserDetails class
                  i.putExtras(bundle);//in bundle we use i.putExtras
                  startActivity(i);//here it starts the activity
    }
     });
}


}
