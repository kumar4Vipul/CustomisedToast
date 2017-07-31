package com.example.abc.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TOAST

        Toast.makeText(getApplicationContext(),"hello This is Toast",Toast.LENGTH_LONG).show();

        //CUSTOMISE A TOAST
       Toast toast=Toast.makeText(getApplicationContext(),"this is a custom toast",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}
