package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.sonu.placeOrder.MSG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View view) {
        Intent intent = new Intent(this, orderActivity2.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName1);
        EditText editText2 = findViewById(R.id.editTextTextPersonName2);
        EditText editText3 = findViewById(R.id.editTextTextPersonName3);
        String message = "order for "+editText1.getText().toString() +" , "
                + editText2.getText().toString()+" & "+ editText3.getText().toString()+" has been succesfully placed";
        intent.putExtra(MSG,message);
        startActivity(intent);

    }
}