package com.example.firebase_authentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    /*This activity is for demo activity. After login or register the user will be redirected to this activity.
    You have to replace this activity with your homepage.

    In this activity there is a signout menu item also. The below code is for signout using menu item.
    */



    FirebaseAuth mauth; // Firebase auth initialization

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mauth = FirebaseAuth.getInstance();  // get instance


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_layout,menu);   //menu inflater
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {  // menu item


        if(item.getItemId()==R.id.signOutMenuId){   // here write the code if the menu item is clicked

            FirebaseAuth.getInstance().signOut();
            finish();
            Intent intent = new Intent(getApplicationContext(),SignIn.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }
}