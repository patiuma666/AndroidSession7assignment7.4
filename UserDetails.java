package com.example.iis5.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

//created second activity as UserDetails
public class UserDetails extends AppCompatActivity {

    //declaring variables for the Textview in the login screen
    TextView name;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {//it is created once the main activity is called
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        //created viewid for the Textview
        name=(TextView)findViewById(R.id.textView);

        //it gets the intent
        Bundle getbundle =this.getIntent().getExtras();
        String n = getbundle.getString("name");
        name.setText("Welcome "+n);//here it displays the welcome username which we declared in the first activity
         Toast.makeText(getApplicationContext(),"Welcome to LoginScreen",Toast.LENGTH_SHORT).show();//it displays the toast here


    }


}
